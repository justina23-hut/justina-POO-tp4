package edu.programacion.ejercicio2409;
import java.util.ArrayList; import java.util.List;

public class Historial {
    private List<PaginaWeb> paginas = new ArrayList<>();

    public void agregarPagina(PaginaWeb p) { paginas.add(p); }
    public void eliminarPagina(PaginaWeb p) { paginas.remove(p); }
    public PaginaWeb ultimaPaginaVisitada() {
        if (paginas.isEmpty()) return null;
        return paginas.get(paginas.size() - 1);
    }
    public int cantidadPaginas() { return paginas.size(); }
}