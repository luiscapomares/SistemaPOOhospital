package modelo.hospital;

import java.time.LocalDate;

public class Diagnostico {

    private int id;
    private String descripcion;
    private String receta;
    private LocalDate fecha;

    public Diagnostico(int id, String descripcion, String receta, LocalDate fecha) {
        this.id = id;
        this.descripcion = descripcion;
        this.receta = receta;
        this.fecha = fecha;
    }
}