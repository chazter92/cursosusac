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
public class DaoPeriodo {

    ConexionMySql conn = new ConexionMySql();

    public ArrayList<DboPeriodo> obtenerPeriodos() {
        ArrayList<DboPeriodo> periodos;
        periodos = convertirDbo(conn.query("SELECT id_periodo, semestre, año FROM periodo",
                new Object[0], new Object[0]));
        return periodos;
    }

    public DboPeriodo obtenerPeriodo(int id_periodo) {
        ArrayList<DboPeriodo> periodos = obtenerPeriodos();

        if (periodos.size() > 0) {
            if (periodos.size() > id_periodo) {
                return periodos.get(id_periodo);
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    private ArrayList<DboPeriodo> convertirDbo(RowSet setPeriodo) {
        if (setPeriodo != null) {
            ArrayList<DboPeriodo> periodos = new ArrayList<>();
            try {
                while (setPeriodo.next()) {
                    DboPeriodo actual = new DboPeriodo(setPeriodo.getInt("id_periodo"), setPeriodo.getString("semestre"), setPeriodo.getInt("año"));
                    periodos.add(actual);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage() + " | " + ex.getSQLState());
            }

            return periodos;
        }
        return null;
    }
}
