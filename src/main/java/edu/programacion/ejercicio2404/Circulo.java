package edu.programacion.ejercicio2404;

public class Circulo extends Figura {
    private Double radio;

    public Circulo(String color, Double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public Double getArea() {
        return Math.PI * radio * radio;
    }
}