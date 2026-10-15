package edu.programacion.ejercicio2405;
import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro unLibro) {
        libros.add(unLibro);
    }

    public void eliminarLibro(Libro unLibro) {
        libros.remove(unLibro);
    }

    public Integer cantidadDeLibros() {
        return libros.size();
    }

    public Integer cantidadTotalDeCopias() {
        int total = 0;
        for (Libro libro : libros) {
            total += libro.getCantidadCopias();
        }
        return total;
    }
}