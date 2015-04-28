/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursac.controlador;

import cursac.modelo.DaoAsignacionHorario;
import cursac.modelo.DaoCurso;
import cursac.modelo.DaoHorario;
import cursac.modelo.DaoSeccion;
import cursac.modelo.DboAsignacionHorario;
import cursac.modelo.DboCurso;
import cursac.modelo.DboHorario;
import cursac.modelo.DboSeccion;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Chaz
 */
public class CalcularAsignacionTraslape {

    private String[] cursos;
    private ArrayList<DboAsignacionHorario> asginaciones;
    private ArrayList<DboAsignacionHorario> traslapes;

    public CalcularAsignacionTraslape(String[] cursos) {
        this.cursos = cursos;
    }

    public ArrayList<DboAsignacionHorario> getAsginaciones() {
        return asginaciones;
    }

    public void setAsginaciones(ArrayList<DboAsignacionHorario> asginaciones) {
        this.asginaciones = asginaciones;
    }

    public ArrayList<DboAsignacionHorario> getTraslapes() {
        return traslapes;
    }

    public void setTraslapes(ArrayList<DboAsignacionHorario> traslapes) {
        this.traslapes = traslapes;
    }

    public boolean hayTraslape() {
        return traslapes.size() > 0;
    }

    public int totalTraslapes() {
        return traslapes.size();
    }

    public int totalAsignaciones() {
        return asginaciones.size();
    }

    public String graficaHorario() {
        DaoHorario daoHorario = new DaoHorario();
        ArrayList<DboHorario> horarios = daoHorario.obtenerHorarios();
        DaoCurso connCurso = new DaoCurso();
        DaoSeccion connSeccion = new DaoSeccion();
        DboAsignacionHorario[][] matrizAsignacion = new DboAsignacionHorario[7][17];
        int maxHorario = 0;

        for (DboAsignacionHorario asignacion : asginaciones) {
            matrizAsignacion[asignacion.getId_dia() - 1][asignacion.getId_horario() - 1] = asignacion;
            if (asignacion.getId_horario() > maxHorario) {
                maxHorario = asignacion.getId_horario();
            }
        }

        HashMap<String, DboCurso> curso = connCurso.obtenerCursos();
        ArrayList<DboSeccion> secciones = connSeccion.obtenerSecciones();

        String devolver = "<table border=\"2\"><tr><th>Horario</th><th>Lunes</th>"
                + "<th>Martes</th><th>Miercoles</th><th>Jueves</th>"
                + "<th>Viernes</th><th>Sabado</th><th>Domingo</th></tr>";
        for (DboHorario horario : horarios) {
            if (horario.getId_horario() <= maxHorario) {
                devolver += "<tr>";
                devolver += "<td>" + horario.getHoraInicio() + "-" + horario.getHoraFin() + "</td>";
                for(int i = 0; i<7 ; i++){
                    DboAsignacionHorario hActual = matrizAsignacion[i][horario.getId_horario()-1];
                    if(hActual != null){
                        devolver += "<td>"+curso.get(String.valueOf(hActual.getCodigo())).getNombre()+"</td>";
                    }else{
                        devolver += "<td></td>";
                    }
                }
                devolver += "</tr>";
            }
        }
        return devolver + "</table>";
    }

    public void calcularAsignacionTraslape() {
        int id_periodo = 3;

        DaoAsignacionHorario connAsignacion = new DaoAsignacionHorario();
        asginaciones = new ArrayList<>();
        traslapes = new ArrayList<>();
        int empezar = 1;

        for (String curso : cursos) {

            String[] partes = curso.split("-");
            ArrayList<DboAsignacionHorario> asignacionActual = connAsignacion.obtenerAsignaciones(id_periodo, Integer.parseInt(partes[0]), Integer.parseInt(partes[1]));
            if (asignacionActual != null) {
                asginaciones.addAll(asignacionActual);
            }
            for (int i = empezar; i < cursos.length; i++) {

                if (cursos[i] != null) {
                    String[] partes2 = cursos[i].split("-");
                    ArrayList<DboAsignacionHorario> traslapeActual = connAsignacion.obtenerTraslapes(Integer.parseInt(partes[0]), Integer.parseInt(partes[1]),
                            Integer.parseInt(partes2[0]), Integer.parseInt(partes2[1]));
                    if (traslapeActual != null) {
                        traslapes.addAll(traslapeActual);
                    }
                }
            }

            empezar++;
        }
    }
}
