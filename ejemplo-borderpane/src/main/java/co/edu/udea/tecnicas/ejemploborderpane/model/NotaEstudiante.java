package co.edu.udea.tecnicas.ejemploborderpane.model;

public class NotaEstudiante {
    //atributos dados por la relación
    private Estudiante estudiante;
    private Nota nota;
    //atributo específico de la clase
    private float valor;

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
