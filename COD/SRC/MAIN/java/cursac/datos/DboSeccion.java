/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursac.datos;

/**
 *
 * @author Chaz
 */
public class DboSeccion {
    private int id_seccion;
    private String seccion;

    public DboSeccion(int id_seccion, String seccion) {
        this.id_seccion = id_seccion;
        this.seccion = seccion;
    }

    public int getId_seccion() {
        return id_seccion;
    }

    public void setId_seccion(int id_seccion) {
        this.id_seccion = id_seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
    
    
}
