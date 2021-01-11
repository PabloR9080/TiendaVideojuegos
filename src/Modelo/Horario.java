/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author lenin
 */
public class Horario {
    private ArrayList<String> dias;
    private Hora horaInicio;
    private Hora horaSalida;

    public Horario(ArrayList<String> dias, Hora horaInicio, Hora horaSalida) {
        this.dias = dias;
        this.horaInicio = horaInicio;
        this.horaSalida = horaSalida;
    }

    public ArrayList<String> getDias() {
        return dias;
    }

    public void setDias(ArrayList<String> dias) {
        this.dias = dias;
    }

    public Hora getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Hora horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Hora getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Hora horaSalida) {
        this.horaSalida = horaSalida;
    }

    @Override
    public String toString() {
        return "Dias: " + getDias() + ", horaInicio: " + getHoraInicio() + ", horaSalida: " + getHoraSalida();
    }
    
}
