package modelo.personas;

import modelo.abstractas.Persona;
import java.time.LocalDate;
import java.util.ArrayList;

public class Paciente extends Persona {

    private final ArrayList<String> alergias;

    public Paciente(int id, String nombre, String apellido, LocalDate fechaNacimiento, String correo,
                    String historiaClinicaId, String grupoSanguineo) {

        super(id, nombre, apellido, fechaNacimiento, correo);
        this.alergias = new ArrayList<>();
    }

    public void agregarAlergia(String alergia) {
        alergias.add(alergia);
    }

    @Override
    public int calcularEdad() {
        return LocalDate.now().getYear() - fechaNacimiento.getYear();
    }

    @Override
    public String obtenerTipo() {
        return "Paciente";
    }
}