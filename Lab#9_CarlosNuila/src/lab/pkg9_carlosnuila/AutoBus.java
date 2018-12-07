/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9_carlosnuila;

import java.util.ArrayList;

/**
 *
 * @author Carlos Nuila
 */
public class AutoBus {
    
    private int numeroIdentificacion;
    private String placa;
    private String color;
    private double velocidad;
    private ArrayList<Estudiante> pasajeros = new ArrayList();

    public AutoBus() {
    }

    public AutoBus(int numeroIdentificacion, double velocidad) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.velocidad = velocidad;
    }

    public AutoBus(int numeroIdentificacion, String placa, String color, double velocidad) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.placa = placa;
        this.color = color;
        this.velocidad = velocidad;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public ArrayList<Estudiante> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<Estudiante> pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        return numeroIdentificacion + "";
    }

    
    
    
}
