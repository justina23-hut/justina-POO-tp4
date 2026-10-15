package edu.programacion.ejercicio2408;

public class Administrativo extends Empleado {
    private int categoria; // 1,2,3,4
    private int antiguedad;

    public Administrativo(String nombre, int dni, String direccion, int anio, String sexo, int categoria, int antiguedad) {
        super(nombre, dni, direccion, anio, sexo);
        this.categoria = categoria; this.antiguedad = antiguedad;
    }
    @Override public double getSalario() {
        return antiguedad * categoria;
    }
}