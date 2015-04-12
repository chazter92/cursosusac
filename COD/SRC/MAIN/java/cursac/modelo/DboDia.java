/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursac.modelo;

/**
 *
 * @author Chaz
 */
public class DboDia {
    private int id_ida;
    private String nombre;

    public DboDia(int id_ida, String nombre) {
        this.id_ida = id_ida;
        this.nombre = nombre;
    }

    public int getId_ida() {
        return id_ida;
    }

    public void setId_ida(int id_ida) {
        this.id_ida = id_ida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
