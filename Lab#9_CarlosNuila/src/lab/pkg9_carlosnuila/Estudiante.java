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
public class Estudiante {
    
    private String nombre;
    private int edad;
    private int numeroCuenta;
    private Parada parada;

    public Estudiante() {
    }

    public Estudiante(String nombre, Parada parada) {
        this.nombre = nombre;
        this.parada = parada;
    }

    public Estudiante(String nombre, int edad, int numeroCuenta, Parada parada) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroCuenta = numeroCuenta;
        this.parada = parada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Parada getParada() {
        return parada;
    }

    public void setParada(Parada parada) {
        this.parada = parada;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
    
    
    
}
