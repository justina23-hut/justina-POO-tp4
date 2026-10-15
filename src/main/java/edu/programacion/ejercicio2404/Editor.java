package edu.programacion.ejercicio2404;

import java.util.ArrayList;
import java.util.List;

public class Editor {
    private List<Figura> figuras = new ArrayList<>();

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    public void borrarFigura(Figura figura) {
        figuras.remove(figura);
    }

    public void pintar() {
        for (Figura f : figuras) {
            f.pintar();
        }
    }

    public Double calcularArea() {
        Double total = 0.0;
        for (Figura f : figuras) {
            total += f.getArea();
        }
        return total;
    }
}