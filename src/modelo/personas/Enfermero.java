package modelo.personas;

import modelo.abstractas.Empleado;
import modelo.enums.Turno;
import java.time.LocalDate;

public class Enfermero extends Empleado {

    private Turno turno;

    public Enfermero(int id, String nombre, String apellido, LocalDate fechaNacimiento, String correo,
                     String legajo, LocalDate fechaContratacion, double salarioBase, boolean activo,
                     Turno turno) {

        super(id, nombre, apellido, fechaNacimiento, correo, legajo, fechaContratacion, salarioBase, activo);
        this.turno = turno;
    }

    public void asistirCirugia() {
        System.out.println("Asistiendo cirugía...");
    }

    @Override
    public double calcularSalario() {
        return salarioBase + 200;
    }

    @Override
    public int calcularEdad() {
        return LocalDate.now().getYear() - fechaNacimiento.getYear();
    }

    @Override
    public String obtenerTipo() {
        return "Enfermero";
    }
}