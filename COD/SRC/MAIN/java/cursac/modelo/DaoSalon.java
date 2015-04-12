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
public class DaoSalon {

    ConexionMySql conn = new ConexionMySql();

    public ArrayList<DboSalon> obtenerSalons() {
        ArrayList<DboSalon> salons;
        salons = convertirDbo(conn.query("SELECT id_salon, nombre, id_edificio FROM salon",
                new Object[0], new Object[0]));
        return salons;
    }

    public DboSalon obtenerSalon(int id_salon) {
        ArrayList<DboSalon> salons = obtenerSalons();

        if (salons.size() > 0) {
            if (salons.size() > id_salon) {
                return salons.get(id_salon);
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    private ArrayList<DboSalon> convertirDbo(RowSet setSalon) {
        if (setSalon != null) {
            ArrayList<DboSalon> salones = new ArrayList<>();
            try {
                while (setSalon.next()) {
                    DboSalon actual = new DboSalon(setSalon.getInt("id_salon"), setSalon.getString("nombre"), setSalon.getInt("id_edificio"));
                    salones.add(actual);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage() + " | " + ex.getSQLState());
            }

            return salones;
        }
        return null;
    }
}
