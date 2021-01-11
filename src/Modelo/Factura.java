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
public class Factura implements PorPagar{
    private ArrayList<String> productos;
    private String idProveedores;

    public Factura(ArrayList<String> productos, String idProveedores) {
        this.productos = productos;
        this.idProveedores = idProveedores;
    }

    public ArrayList<String> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<String> productos) {
        this.productos = productos;
    }

    public String getIdProveedores() {
        return idProveedores;
    }

    public void setIdProveedores(String idProveedores) {
        this.idProveedores = idProveedores;
    }

    @Override
    public double obtenerMontoPago() {
        return 0.00;
    }
    
    @Override
    public String toString() {
        return "Productos: " + getProductos() + ", idProveedores: " + getIdProveedores();
    }
    
}
