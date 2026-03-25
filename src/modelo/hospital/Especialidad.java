package modelo.hospital;

public class Especialidad {

    private String codigo;
    private String nombre;
    private String descripcion;
    private double costoConsulta;

    public Especialidad(String codigo, String nombre, String descripcion, double costoConsulta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costoConsulta = costoConsulta;
    }

    public double getCostoConsulta() {
        return costoConsulta;
    }
}