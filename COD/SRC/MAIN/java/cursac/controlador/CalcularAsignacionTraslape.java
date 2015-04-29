/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursac.controlador;

import cursac.modelo.DaoAsignacionHorario;
import cursac.modelo.DaoCurso;
import cursac.modelo.DaoDia;
import cursac.modelo.DaoEdificio;
import cursac.modelo.DaoHorario;
import cursac.modelo.DaoSalon;
import cursac.modelo.DaoSeccion;
import cursac.modelo.DboAsignacionHorario;
import cursac.modelo.DboCurso;
import cursac.modelo.DboDia;
import cursac.modelo.DboEdificio;
import cursac.modelo.DboHorario;
import cursac.modelo.DboSalon;
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
    private HashMap<String, DboCurso> curso;
    private ArrayList<DboSeccion> secciones;
    private ArrayList<DboHorario> horarios;

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
        horarios = daoHorario.obtenerHorarios();
        DaoCurso connCurso = new DaoCurso();
        DaoSeccion connSeccion = new DaoSeccion();
        DaoEdificio connEdificio = new DaoEdificio();
        DaoSalon connSalon = new DaoSalon();
        DboAsignacionHorario[][] matrizAsignacion = new DboAsignacionHorario[7][17];
        int maxHorario = 0;
        int minHorario = 14;
        for (DboAsignacionHorario asignacion : asginaciones) {
            matrizAsignacion[asignacion.getId_dia() - 1][asignacion.getId_horario() - 1] = asignacion;
            if (asignacion.getId_horario() > maxHorario) {
                maxHorario = asignacion.getId_horario();
            }
            if (asignacion.getId_horario() < minHorario) {
                minHorario = asignacion.getId_horario();
            }
        }

        curso = connCurso.obtenerCursos();
        secciones = connSeccion.obtenerSecciones();
        ArrayList<DboEdificio> edificios = connEdificio.obtenerEdificios();
        ArrayList<DboSalon> salones = connSalon.obtenerSalons();

        String devolver = "<div class=\"CSSTableGenerator\" ><table border=\"2\"><tr><th>Horario</th><th>Lunes</th>"
                + "<th>Martes</th><th>Miercoles</th><th>Jueves</th>"
                + "<th>Viernes</th><th>Sabado</th><th>Domingo</th></tr>";
        java.text.SimpleDateFormat formatear = new java.text.SimpleDateFormat("hh:mm");
        for (DboHorario horario : horarios) {
            if (horario.getId_horario() <= maxHorario && horario.getId_horario() >= minHorario) {
                devolver += "<tr>";
                devolver += "<td>" + formatear.format(horario.getHoraInicio()) + "</td>";
                for (int i = 0; i < 7; i++) {
                    DboAsignacionHorario hActual = matrizAsignacion[i][horario.getId_horario() - 1];
                    if (hActual != null) {
                        devolver += "<td>" + curso.get(String.valueOf(hActual.getCodigo())).getNombre()
                                + "</br>Sección: " + secciones.get(hActual.getId_seccion() - 1).getSeccion()
                                + "</br>" + edificios.get(salones.get(hActual.getId_salon() - 1).getId_edificio() - 1).getNombre() + "   " + salones.get(hActual.getId_salon() - 1).getNombre()
                                + "</td>";
                    } else {
                        devolver += "<td></td>";
                    }
                }
                devolver += "</tr>";
            }
        }
        return devolver + "</table></div>";
    }

    public String detalleTraslapes() {
        if (hayTraslape()) {
            DaoDia connDia = new DaoDia();
            ArrayList<DboDia> dias = connDia.obtenerDias();
            String devolver = "<div class=\"tablaTraslape\" ><table><tr><th>Curso</th>"
                    + "<th>Día</th><th>Horario</th></tr>";
            java.text.SimpleDateFormat formatear = new java.text.SimpleDateFormat("hh:mm");
            for (DboAsignacionHorario traslape : traslapes) {
                devolver += "<tr><td>" + curso.get(String.valueOf(traslape.getCodigo())).getNombre() + " - " +  secciones.get(traslape.getId_seccion()-1).getSeccion() + "</td>"
                        + "<td>" + dias.get(traslape.getId_dia()-1).getNombre() + "</td>"
                        + "<td>" + formatear.format(horarios.get(traslape.getId_horario()-1).getHoraInicio()) + "</td></tr>";
            }

            return devolver + "</table></div>";
        }
        return "";
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
