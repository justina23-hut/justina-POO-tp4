package edu.programacion.ejercicio2405;
import java.util.List;

public class Libro {
    private String titulo;
    private String autor;
    private String fechaPublicacion;
    private List<String> personajes;
    private Integer cantidadCopias;

    public Libro(String titulo, String autor, String fechaPublicacion, List<String> personajes, Integer cantidadCopias) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.personajes = personajes;
        this.cantidadCopias = cantidadCopias;
    }

    public Integer getCantidadCopias() {
        return cantidadCopias;
    }
}