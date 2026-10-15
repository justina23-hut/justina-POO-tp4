package edu.programacion.ejercicio2406;

public class Pelicula extends ProduccionAudiovisual {
    private Integer duracionMinutos;

    public Pelicula(String titulo, Integer anio, String genero, Integer duracionMinutos) {
        super(titulo, anio, genero);
        this.duracionMinutos = duracionMinutos;
    }
}