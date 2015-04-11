/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursac.datos;

import cursac.controlador.ConexionMySql;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.RowSet;

/**
 *
 * @author Chaz
 */
public class DaoAsignacionHorario {
     ConexionMySql conn = new ConexionMySql();

    public ArrayList<DboAsignacionHorario> obtenerAsignaciones(int id_periodo) {
        ArrayList<DboAsignacionHorario> asignaciones;
        asignaciones = convertirDbo(conn.query("SELECT id_seccion, id_periodo, id_dia, id_salon, id_horario, codigo "
                + "FROM asginacion_horario WHERE id_periodo = ?",
                new Object[]{id_periodo}, new Object[]{id_periodo}));
        return asignaciones;
    }
    
    public ArrayList<DboAsignacionHorario> obtenerCursoSeccion(int id_periodo) {
        ArrayList<DboAsignacionHorario> asignaciones;
        asignaciones = convertirDbo(conn.query("SELECT id_seccion, id_periodo, id_dia, id_salon, id_horario, codigo "
                + "FROM asignacion_horario WHERE id_periodo = ? GROUP BY codigo, id_seccion",
                new Object[]{id_periodo}, new Object[]{id_periodo}));
        return asignaciones;
    }
    
    private ArrayList<DboAsignacionHorario> convertirDbo(RowSet setAsignacion) {
        if (setAsignacion != null) {
            ArrayList<DboAsignacionHorario> asignaciones = new ArrayList<>();
            try {
                while (setAsignacion.next()) {
                    DboAsignacionHorario actual = new DboAsignacionHorario(setAsignacion.getInt("id_seccion"),
                            setAsignacion.getInt("id_periodo"),setAsignacion.getInt("id_dia"), setAsignacion.getInt("id_salon"), 
                            setAsignacion.getInt("id_horario"), setAsignacion.getInt("codigo"));
                    asignaciones.add(actual);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage() + " | " + ex.getSQLState());
            }

            return asignaciones;
        }
        return null;
    }
}
