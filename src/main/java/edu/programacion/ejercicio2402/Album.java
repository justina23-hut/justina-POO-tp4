package edu.programacion.ejercicio2402;
import java.util.ArrayList;
import java.util.Collection;

public class Album {

    private String nombre;
    private Collection<Foto> fotos;

    public Album() {
        fotos = new ArrayList<>();
    }

    public void agregarFoto(Foto foto) {
        fotos.add(foto);
    }

    public void agregarFotos(Collection<Foto> fotos) {
        this.fotos.addAll(fotos);
    }

    public void eliminarFoto(Foto foto) {
        fotos.remove(foto);
    }

    public void limpiarAlbum() {
        fotos.clear();
    }

    public int cantidadDeFotos() {
        return fotos.size();
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}