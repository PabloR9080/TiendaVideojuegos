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
public class Proveedores extends Persona{
    private String email;

    public Proveedores(String email, String clavePersona, String nombre, String numeroTelefono) {
        super(clavePersona, nombre, numeroTelefono);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString() + ", email=" + getEmail();
    }
    
}
