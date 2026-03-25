package modelo.abstractas;

import java.time.LocalDate;

public abstract class Persona {

    protected int id;
    protected String nombre;
    protected String apellido;
    protected LocalDate fechaNacimiento;
    protected String correo;

    public Persona(int id, String nombre, String apellido, LocalDate fechaNacimiento, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
    }

    public abstract int calcularEdad();
    public abstract String obtenerTipo();
}