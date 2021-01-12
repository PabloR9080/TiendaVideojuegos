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
    private ArrayList<Producto> productos;
    private String idProveedores;

    public Factura(ArrayList<Producto> productos, String idProveedores) {
        this.productos = productos;
        this.idProveedores = idProveedores;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
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
        double total = 0.0;
        for(int i = 0; i < productos.size(); i++){
            total = total + productos.get(i).getPrecioPorArticulo()* productos.get(i).getCantComprar();
        }
        return total;
    }
    
    @Override
    public String toString() {
        return "Productos: " + getProductos() + ", idProveedores: " + getIdProveedores();
    }
    
}
