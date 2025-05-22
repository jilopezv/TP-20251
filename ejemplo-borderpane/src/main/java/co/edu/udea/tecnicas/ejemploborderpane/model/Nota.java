package co.edu.udea.tecnicas.ejemploborderpane.model;

public class Nota {
    private String nombre;
    private String descripcion;
    private float porcentaje;

    public Nota(String nombre, String descripcion, float porcentaje) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.porcentaje = porcentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String toString() {
        return this.nombre + " - " + this.porcentaje;
    }
}
