package edu.programacion.ejercicio2404;

public abstract class Figura {
    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract Double getArea();

    public void pintar() {
        System.out.println("Pintando " + this.getClass().getSimpleName() + " " + color);
    }
}