/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9_carlosnuila;

/**
 *
 * @author Carlos Nuila
 */
public class Parada {
    
    private String nombre;
    private double distancia;
    private double angulo;
    private double coorX;
    private double coorY;

    public Parada() {
    }

    public Parada(String nombre, double distancia, double angulo) {
        this.nombre = nombre;
        this.distancia = distancia;
        this.angulo = angulo;
        coorX = distancia * Math.cos(angulo) ;
        coorY = distancia * Math.sin(angulo) ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getCoorX() {
        return coorX;
    }

    public void setCoorX(double coorX) {
        this.coorX = coorX;
    }

    public double getCoorY() {
        return coorY;
    }

    public void setCoorY(double coorY) {
        this.coorY = coorY;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
    
    
}
