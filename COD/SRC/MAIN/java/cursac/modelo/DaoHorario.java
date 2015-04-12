/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursac.modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.RowSet;

/**
 *
 * @author Chaz
 */
public class DaoHorario {

    ConexionMySql conn = new ConexionMySql();

    public ArrayList<DboHorario> obtenerHorarios() {
        ArrayList<DboHorario> horarios;
        horarios = convertirDbo(conn.query("SELECT id_horario, horaInicio, horaFin FROM horario",
                new Object[0], new Object[0]));
        return horarios;
    }

    public DboHorario obtenerHorario(int id_horario) {
        ArrayList<DboHorario> horarios = obtenerHorarios();

        if (horarios.size() > 0) {
            if (horarios.size() > id_horario) {
                return horarios.get(id_horario);
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    private ArrayList<DboHorario> convertirDbo(RowSet setHorario) {
        if (setHorario != null) {
            ArrayList<DboHorario> horarios = new ArrayList<>();
            try {
                while (setHorario.next()) {
                    DboHorario actual = new DboHorario(setHorario.getInt("id_horario"), setHorario.getTime("horaInicio"), setHorario.getTime("horaFin"));
                    horarios.add(actual);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage() + " | " + ex.getSQLState());
            }

            return horarios;
        }
        return null;
    }
}
