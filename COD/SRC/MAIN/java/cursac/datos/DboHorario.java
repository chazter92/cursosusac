/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursac.datos;

import java.sql.Time;

/**
 *
 * @author Chaz
 */
public class DboHorario {
    private int id_horario;
    private Time horaInicio;
    private Time horaFin;

    public DboHorario(int id_horario, Time horaInicio, Time horaFin) {
        this.id_horario = id_horario;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }
    
    
}
