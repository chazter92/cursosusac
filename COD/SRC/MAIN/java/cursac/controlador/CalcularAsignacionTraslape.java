/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursac.controlador;

import cursac.modelo.DaoAsignacionHorario;
import cursac.modelo.DboAsignacionHorario;
import java.util.ArrayList;

/**
 *
 * @author Chaz
 */
public class CalcularAsignacionTraslape {
    private String[] cursos;
    private ArrayList<DboAsignacionHorario> asginaciones; 
    private ArrayList<DboAsignacionHorario> traslapes;
    
    public CalcularAsignacionTraslape(String[] cursos){
        this.cursos = cursos;
    }
    
    public boolean hayTraslape(){
        return traslapes.size()>0;
    }
    
    public int totalTraslapes(){
        return traslapes.size();
    }
    
    public int totalAsignaciones(){
        return asginaciones.size();
    }
    
    public void calcularAsignacionTraslape(){
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
                    ArrayList<DboAsignacionHorario> traslapeActual = connAsignacion.obtenerTraslapes(id_periodo, Integer.parseInt(partes[0]), Integer.parseInt(partes[1]),
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
