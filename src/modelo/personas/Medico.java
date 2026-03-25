package modelo.personas;

import modelo.abstractas.Empleado;
import java.time.LocalDate;

public class Medico extends Empleado {

    private String numeroLicencia;
    private String especialidad;

    public Medico(int id, String nombre, String apellido, LocalDate fechaNacimiento, String correo,
                  String legajo, LocalDate fechaContratacion, double salarioBase, boolean activo,
                  String numeroLicencia, String especialidad) {

        super(id, nombre, apellido, fechaNacimiento, correo, legajo, fechaContratacion, salarioBase, activo);
        this.numeroLicencia = numeroLicencia;
        this.especialidad = especialidad;
    }

    public void atenderPaciente() {
        System.out.println("Atendiendo paciente...");
    }

    @Override
    public double calcularSalario() {
        return salarioBase + 500;
    }

    @Override
    public int calcularEdad() {
        return LocalDate.now().getYear() - fechaNacimiento.getYear();
    }

    @Override
    public String obtenerTipo() {
        return "Medico";
    }
}