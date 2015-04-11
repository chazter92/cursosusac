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
public class DboEdificio {
    private int id_edificio;
    private String nombre;

    public DboEdificio(int id_edificio, String nombre) {
        this.id_edificio = id_edificio;
        this.nombre = nombre;
    }

    public int getId_edificio() {
        return id_edificio;
    }

    public void setId_edificio(int id_edificio) {
        this.id_edificio = id_edificio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
