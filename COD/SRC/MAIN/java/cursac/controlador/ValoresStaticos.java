/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursac.controlador;

import cursac.modelo.DaoCurso;
import cursac.modelo.DaoEdificio;
import cursac.modelo.DaoHorario;
import cursac.modelo.DaoSalon;
import cursac.modelo.DaoSeccion;
import cursac.modelo.DboAsignacionHorario;
import cursac.modelo.DboCurso;
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
public class ValoresStaticos {
    
    static DaoHorario daoHorario = new DaoHorario();
    static DaoCurso connCurso = new DaoCurso();
    static DaoSeccion connSeccion = new DaoSeccion();
    static DaoEdificio connEdificio = new DaoEdificio();
    static DaoSalon connSalon = new DaoSalon();
    
    
    public static HashMap<String, DboCurso> curso = connCurso.obtenerCursos();;
    public static ArrayList<DboSeccion> secciones = connSeccion.obtenerSecciones();
    public static ArrayList<DboHorario> horarios = daoHorario.obtenerHorarios();
    public static ArrayList<DboEdificio> edificios = connEdificio.obtenerEdificios();        
    public static ArrayList<DboSalon> salones = connSalon.obtenerSalons();
    
    
}
