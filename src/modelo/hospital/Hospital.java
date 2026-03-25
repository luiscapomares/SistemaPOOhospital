package modelo.hospital;

import modelo.abstractas.Empleado;
import modelo.personas.Paciente;
import java.util.ArrayList;

public class Hospital {

    private String nombre;
    private ArrayList<Empleado> empleados;
    private ArrayList<Paciente> pacientes;
    private ArrayList<CitaMedica> citas;

    public Hospital(String nombre) {
        this.nombre = nombre;
        empleados = new ArrayList<>();
        pacientes = new ArrayList<>();
        citas = new ArrayList<>();
    }

    public void contratarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void registrarPaciente(Paciente p) {
        pacientes.add(p);
    }

    public void agendarCita(CitaMedica c) {
        citas.add(c);
    }

    public double calcularNominaTotal() {
        double total = 0;
        for (Empleado e : empleados) {
            total += e.calcularSalario();
        }
        return total;
    }
}