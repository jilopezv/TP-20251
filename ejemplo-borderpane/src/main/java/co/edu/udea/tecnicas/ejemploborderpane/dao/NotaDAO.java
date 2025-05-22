package co.edu.udea.tecnicas.ejemploborderpane.dao;

import co.edu.udea.tecnicas.ejemploborderpane.model.Nota;

import java.util.Arrays;
import java.util.List;

public class NotaDAO {
    // Simulación de una base de datos
    private static final List<Nota> notasDB = Arrays.asList(new Nota("Nota 1", "Primera nota del curso", 0.3f),
            new Nota("Nota 2", "Segunda nota del curso", 0.1f));

    public NotaDAO() {
    }

    public void guardarNota(Nota nota) {
        notasDB.add(nota);
    }

    public List<Nota> obtenerNotas() {
        return notasDB;
    }
}
