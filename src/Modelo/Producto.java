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
public class Producto {
    private String idProducto;
    private String nombre;
    private double precio;
    private int stock;
    private int cantComprar;
    private double precioPorArticulo;

    public Producto(String idProducto, String nombre, double precio, int stock, int cantComprar, double precioPorArticulo) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.cantComprar = cantComprar;
        this.precioPorArticulo = precioPorArticulo;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCantComprar() {
        return cantComprar;
    }

    public void setCantComprar(int cantComprar) {
        this.cantComprar = cantComprar;
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        this.precioPorArticulo = precioPorArticulo;
    }

    @Override
    public String toString() {
        return "idProducto: " + getIdProducto() + ", nombre: " + getNombre() + ", precio: " + getPrecio() + ", stock: " + getStock() + ", cantComprar: " + getCantComprar() + ", precioPorArticulo: " + getPrecioPorArticulo();
    }
    
}
