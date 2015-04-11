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
public class DaoSeccion {

    ConexionMySql conn = new ConexionMySql();

    public ArrayList<DboSeccion> obtenerSecciones() {
        ArrayList<DboSeccion> secciones;
        secciones = convertirDbo(conn.query("SELECT id_seccion, nombre FROM seccion",
                new Object[0], new Object[0]));
        return secciones;
    }

    public DboSeccion obtenerSeccion(int id_seccion) {
        ArrayList<DboSeccion> secciones = obtenerSecciones();

        if (secciones.size() > 0) {
            if (secciones.size() > id_seccion) {
                return secciones.get(id_seccion);
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    private ArrayList<DboSeccion> convertirDbo(RowSet setSeccion) {
        if (setSeccion != null) {
            ArrayList<DboSeccion> secciones = new ArrayList<>();
            try {
                while (setSeccion.next()) {
                    DboSeccion actual = new DboSeccion(setSeccion.getInt("id_seccion"), setSeccion.getString("nombre"));
                    secciones.add(actual);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage() + " | " + ex.getSQLState());
            }

            return secciones;
        }
        return null;
    }
}
