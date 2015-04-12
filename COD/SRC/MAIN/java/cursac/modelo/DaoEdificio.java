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
public class DaoEdificio {

    ConexionMySql conn = new ConexionMySql();

    public ArrayList<DboEdificio> obtenerEdificios() {
        ArrayList<DboEdificio> edificios;
        edificios = convertirDbo(conn.query("SELECT id_edificio, nombre FROM edificio",
                new Object[0], new Object[0]));
        return edificios;
    }

    public DboEdificio obtenerEdificio(int id_edificio) {
        ArrayList<DboEdificio> edificios = obtenerEdificios();

        if (edificios.size() > 0) {
            if (edificios.size() > id_edificio) {
                return edificios.get(id_edificio);
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    private ArrayList<DboEdificio> convertirDbo(RowSet setEdificio) {
        if (setEdificio != null) {
            ArrayList<DboEdificio> edificios = new ArrayList<>();
            try {
                while (setEdificio.next()) {
                    DboEdificio actual = new DboEdificio(setEdificio.getInt("id_edificio"), setEdificio.getString("nombre"));
                    edificios.add(actual);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage() + " | " + ex.getSQLState());
            }

            return edificios;
        }
        return null;
    }
}
