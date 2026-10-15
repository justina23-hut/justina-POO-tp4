package edu.programacion.ejercicio2408;

public class Tecnico extends Empleado {
    private String titulo;
    private double montoContrato;

    public Tecnico(String nombre, int dni, String direccion, int anio, String sexo, String titulo, double montoContrato) {
        super(nombre, dni, direccion, anio, sexo);
        this.titulo = titulo; this.montoContrato = montoContrato;
    }
    @Override public double getSalario() { return montoContrato; }
}