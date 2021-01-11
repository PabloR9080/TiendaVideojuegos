/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author lenin
 */
public class Persona {
    private String clavePersona;
    private String nombre;
    private String numeroTelefono;

    public Persona(String clavePersona, String nombre, String numeroTelefono) {
        this.clavePersona = clavePersona;
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
    }

    public String getClavePersona() {
        return clavePersona;
    }

    public void setClavePersona(String clavePersona) {
        this.clavePersona = clavePersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return "ClavePersona: " + getClavePersona() + ", nombre: " + getNombre() + ", numeroTelefono: " + getNumeroTelefono();
    }
    
}
