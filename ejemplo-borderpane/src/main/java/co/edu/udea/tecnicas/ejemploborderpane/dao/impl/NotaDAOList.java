package co.edu.udea.tecnicas.ejemploborderpane.dao.impl;

import co.edu.udea.tecnicas.ejemploborderpane.dao.NotaDAO;
import co.edu.udea.tecnicas.ejemploborderpane.model.Nota;

import java.util.Arrays;
import java.util.List;

public class NotaDAOList implements NotaDAO {
    // Simulación de una base de datos
    private static final List<Nota> notasDB = Arrays.asList(new Nota("Nota 1", "Primera nota del curso", 0.3f),
            new Nota("Nota 2", "Segunda nota del curso", 0.1f));

    public NotaDAOList() {
        System.out.println("Inicializando la base de datos de notas en memoria");
    }

    public void guardarNota(Nota nota) {
        notasDB.add(nota);
    }

    public List<Nota> obtenerNotas() {
        return notasDB;
    }
}
