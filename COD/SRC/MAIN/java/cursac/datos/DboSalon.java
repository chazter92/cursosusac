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
public class DboSalon {
    private int id_salon;
    private String nombre;
    private int id_edificio;

    public DboSalon(int id_salon, String nombre, int id_edificio) {
        this.id_salon = id_salon;
        this.nombre = nombre;
        this.id_edificio = id_edificio;
    }

    public int getId_salon() {
        return id_salon;
    }

    public void setId_salon(int id_salon) {
        this.id_salon = id_salon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_edificio() {
        return id_edificio;
    }

    public void setId_edificio(int id_edificio) {
        this.id_edificio = id_edificio;
    }
    
    
}
