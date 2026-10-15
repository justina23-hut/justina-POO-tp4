package edu.programacion.ejercicio2408;

public abstract class Empleado extends Persona {
    public Empleado(String nombre, int dni, String direccion, int anioNacimiento, String sexo) {
        super(nombre, dni, direccion, anioNacimiento, sexo);
    }
    public abstract double getSalario();
}