package modelo.personas;

import java.time.LocalDate;

public class Cirujano extends Medico {

    private int cirugiasRealizadas;

    public Cirujano(int id, String nombre, String apellido, LocalDate fechaNacimiento, String correo,
                    String legajo, LocalDate fechaContratacion, double salarioBase, boolean activo,
                    String numeroLicencia, String especialidad, int cirugiasRealizadas) {

        super(id, nombre, apellido, fechaNacimiento, correo, legajo, fechaContratacion, salarioBase, activo,
              numeroLicencia, especialidad);

        this.cirugiasRealizadas = cirugiasRealizadas;
    }

    public void realizarCirugia() {
        System.out.println("Cirugía realizada");
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (cirugiasRealizadas * 100);
    }

    @Override
    public String obtenerTipo() {
        return "Cirujano";
    }
}