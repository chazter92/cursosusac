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
public class DboAsignacionHorario {
    private int id_seccion;
    private int id_periodo;
    private int id_dia;
    private int id_salon;
    private int id_horario;
    private int codigo;

    public DboAsignacionHorario(int id_seccion, int id_periodo, int id_dia, int id_salon, int id_horario, int codigo) {
        this.id_seccion = id_seccion;
        this.id_periodo = id_periodo;
        this.id_dia = id_dia;
        this.id_salon = id_salon;
        this.id_horario = id_horario;
        this.codigo = codigo;
    }

    public int getId_seccion() {
        return id_seccion;
    }

    public void setId_seccion(int id_seccion) {
        this.id_seccion = id_seccion;
    }

    public int getId_periodo() {
        return id_periodo;
    }

    public void setId_periodo(int id_periodo) {
        this.id_periodo = id_periodo;
    }

    public int getId_dia() {
        return id_dia;
    }

    public void setId_dia(int id_dia) {
        this.id_dia = id_dia;
    }

    public int getId_salon() {
        return id_salon;
    }

    public void setId_salon(int id_salon) {
        this.id_salon = id_salon;
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String codigoSeccion(){
        return this.codigo + "-" + this.id_seccion;
    }    
}
