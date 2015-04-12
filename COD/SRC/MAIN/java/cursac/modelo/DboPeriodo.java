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
public class DboPeriodo {
    private int id_periodo;
    private String semestre;
    private int anio;

    public DboPeriodo(int id_periodo, String semestre, int anio) {
        this.id_periodo = id_periodo;
        this.semestre = semestre;
        this.anio = anio;
    }

    public int getId_periodo() {
        return id_periodo;
    }

    public void setId_periodo(int id_periodo) {
        this.id_periodo = id_periodo;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
}
