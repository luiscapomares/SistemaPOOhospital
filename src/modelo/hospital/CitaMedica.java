package modelo.hospital;

import modelo.personas.Paciente;
import modelo.personas.Medico;
import modelo.enums.EstadoCita;
import java.time.LocalDateTime;

public class CitaMedica {

    private int id;
    private Paciente paciente;
    private Medico medico;
    private LocalDateTime fechaHora;
    private String motivo;
    private EstadoCita estado;
    private double costo;

    public CitaMedica(int id, Paciente paciente, Medico medico, LocalDateTime fechaHora, String motivo) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.fechaHora = fechaHora;
        this.motivo = motivo;
        this.estado = EstadoCita.PENDIENTE;
    }

    public void completar() {
        estado = EstadoCita.COMPLETADA;
    }

    public void cancelar() {
        estado = EstadoCita.CANCELADA;
    }
}