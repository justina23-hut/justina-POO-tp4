package edu.programacion.ejercicio2409;
import java.time.LocalDate;

public class PaginaWeb {
    private String direccionWeb;
    private LocalDate fechaVisita;
    private int tamanio;
    private String codigoHTML;

    public PaginaWeb(String direccionWeb, LocalDate fechaVisita, int tamanio, String codigoHTML) {
        this.direccionWeb = direccionWeb;
        this.fechaVisita = fechaVisita;
        this.tamanio = tamanio;
        this.codigoHTML = codigoHTML;
    }
    public String getDireccionWeb() { return direccionWeb; }
    public LocalDate getFechaVisita() { return fechaVisita; }
}