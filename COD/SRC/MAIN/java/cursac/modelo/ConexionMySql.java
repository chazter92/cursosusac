/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursac.modelo;

import com.sun.rowset.CachedRowSetImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.rowset.CachedRowSet;

/**
 *
 * @author Chaz
 */
public class ConexionMySql {

    public CachedRowSet query(String query, Object[] datos, Object[] tipos) {
        String dbUrl = "https://cursac-ayd2usac.rhcloud.com/phpmyadmin/#PMAURL-5:db_structure.php?db=cursac&table=&server=1&target=&token=726ac10705dca6f895d538a3183c8d9c";
        String dbClass = "com.mysql.jdbc.Driver";
        String username = "adminxpshY3v";
        String password = "k1mCiT__2wSL";
        try {

            Class.forName(dbClass);
            Connection connection = DriverManager.getConnection(dbUrl,
                    username, password);
            
            PreparedStatement ps = connection.prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            for (int i = 0; i < datos.length; i++) {
                String clase = tipos[i].getClass().getSimpleName();
                if (datos[i] == null) {
                    int sqlType = java.sql.Types.INTEGER;
                    if (clase.equalsIgnoreCase("String")) {
                        sqlType = java.sql.Types.VARCHAR;
                    } else if (clase.equalsIgnoreCase("Integer")) {
                        sqlType = java.sql.Types.INTEGER;
                    } else if (clase.equalsIgnoreCase("Doble")) {
                        sqlType = java.sql.Types.NUMERIC;
                    } else if (clase.equalsIgnoreCase("Boolean")) {
                        sqlType = java.sql.Types.BOOLEAN;
                    }

                    ps.setNull(i + 1, sqlType);
                } else {
                    if (clase.equalsIgnoreCase("String")) {
                        ps.setString(i + 1, datos[i].toString());
                    } else if (clase.equalsIgnoreCase("Integer")) {
                        ps.setInt(i + 1, Integer.parseInt(datos[i].toString()));
                    } else if (clase.equalsIgnoreCase("Double")) {
                        ps.setDouble(i + 1, Double.parseDouble(datos[i].toString()));
                    } else if (clase.equalsIgnoreCase("Boolean")) {
                        ps.setBoolean(i + 1, Boolean.parseBoolean(datos[i].toString()));
                    }else{
                        ps.setString(i + 1, datos[i].toString());
                    }
                }
            }

            ResultSet rs = ps.executeQuery();

            CachedRowSet crs = new CachedRowSetImpl();
            crs.populate(rs);

            rs.close();
            ps.close();
            connection.close();

            return crs;

            
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
       return null;
    }
}
