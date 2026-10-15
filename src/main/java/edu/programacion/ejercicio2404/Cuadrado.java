package edu.programacion.ejercicio2404;

public class Cuadrado extends Figura {
    private Double lado;

    public Cuadrado(String color, Double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public Double getArea() {
        return lado * lado;
    }
}