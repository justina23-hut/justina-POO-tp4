package edu.programacion.ejercicio2404;

public class Linea extends Figura {
    private Double largo;

    public Linea(String color, Double largo) {
        super(color);
        this.largo = largo;
    }

    @Override
    public Double getArea() {
        return 0.0; // Una línea no tiene área
    }
}