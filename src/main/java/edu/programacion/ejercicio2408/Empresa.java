package edu.programacion.ejercicio2408;
import java.util.ArrayList; import java.util.List;

public class Empresa {
    private List<Empleado> empleados = new ArrayList<>();

    public void agregarEmpleado(Empleado e) { empleados.add(e); }

    public double montoTotal() {
        double total = 0;
        for (Empleado e : empleados) total += e.getSalario();
        return total;
    }
}