package edu.programacion.ejercicio2409;
import java.util.HashSet; import java.util.Set;

public class Favoritos {
    private Set<String> direcciones = new HashSet<>();
    public void agregarDireccion(String dir) { direcciones.add(dir); }
    public void eliminarDireccion(String dir) { direcciones.remove(dir); }
    public Set<String> getDirecciones() { return direcciones; }
}