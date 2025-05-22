package co.edu.udea.tecnicas.ejemploborderpane.model;

public class Estudiante {
    private String id;
    private String nombres;
    private String programa;

    public Estudiante() {

    }

    public Estudiante(String id, String nombres, String programa) {
        this.id = id;
        this.nombres = nombres;
        this.programa = programa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String toString() {
        return this.id + " - " + this.nombres;
    }
}
