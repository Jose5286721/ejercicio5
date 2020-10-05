/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.ejercicio5.entity;

/**
 *
 * @author 
 */
public class Medicamento {
    private String id;
    private String marca;
    private String modelo;
    private int cantidad;
    private String fecha;

    public Medicamento() {
    }

    public Medicamento(String id, String marca, String modelo, int cantidad, String fecha) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", cantidad=" + cantidad + ", fecha=" + fecha + '}';
    }
    
    
}
