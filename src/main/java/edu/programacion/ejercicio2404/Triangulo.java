package edu.programacion.ejercicio2404;

public class Triangulo extends Figura {
    private Double base;
    private Double altura;

    public Triangulo(String color, Double base, Double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double getArea() {
        return (base * altura) / 2;
    }
}