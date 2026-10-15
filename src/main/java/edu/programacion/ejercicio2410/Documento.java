package edu.programacion.ejercicio2410;
import java.time.LocalDate;
import java.util.ArrayList; import java.util.List;

public class Documento {
    private String nombre;
    private String texto;
    private LocalDate fechaCreacion;
    private Persona duenio;
    private List<Editor> editores = new ArrayList<>();

    public Documento(String nombre, String texto, LocalDate fechaCreacion, Persona duenio) {
        this.nombre = nombre; this.texto = texto;
        this.fechaCreacion = fechaCreacion; this.duenio = duenio;
    }
    public void agregarEditor(Editor e) { editores.add(e); }
    public List<Editor> getEditores() { return editores; }
}