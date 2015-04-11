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
public class DaoDia {

    ConexionMySql conn = new ConexionMySql();

    public ArrayList<DboDia> obtenerDias() {
        ArrayList<DboDia> dias;
        dias = convertirDbo(conn.query("SELECT id_dia, nombre FROM dia",
                new Object[0], new Object[0]));
        return dias;
    }

    public DboDia obtenerDia(int id_dia) {
        ArrayList<DboDia> dias = obtenerDias();

        if (dias.size() > 0) {
            if (dias.size() > id_dia) {
                return dias.get(id_dia);
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    private ArrayList<DboDia> convertirDbo(RowSet setDia) {
        if (setDia != null) {
            ArrayList<DboDia> dias = new ArrayList<>();
            try {
                while (setDia.next()) {
                    DboDia actual = new DboDia(setDia.getInt("id_dia"), setDia.getString("nombre"));
                    dias.add(actual);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage() + " | " + ex.getSQLState());
            }

            return dias;
        }
        return null;
    }
}
