package modelo.abstractas;

import java.time.LocalDate;

public abstract class Empleado extends Persona {

    protected String legajo;
    protected LocalDate fechaContratacion;
    protected double salarioBase;
    protected boolean activo;

    public Empleado(int id, String nombre, String apellido, LocalDate fechaNacimiento, String correo,
                    String legajo, LocalDate fechaContratacion, double salarioBase, boolean activo) {

        super(id, nombre, apellido, fechaNacimiento, correo);
        this.legajo = legajo;
        this.fechaContratacion = fechaContratacion;
        this.salarioBase = salarioBase;
        this.activo = activo;
    }

    public abstract double calcularSalario();

    public int antiguedad() {
        return LocalDate.now().getYear() - fechaContratacion.getYear();
    }
}