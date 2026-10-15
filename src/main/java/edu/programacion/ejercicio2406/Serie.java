package edu.programacion.ejercicio2406;
import java.util.ArrayList;
import java.util.List;

public class Serie extends ProduccionAudiovisual {
    private Integer temporadas;
    private List<Capitulo> capitulos = new ArrayList<>();

    public Serie(String titulo, Integer anio, String genero, Integer temporadas) {
        super(titulo, anio, genero);
        this.temporadas = temporadas;
    }

    public void agregarCapitulo(Capitulo c) {
        capitulos.add(c);
    }
}