package co.edu.udea.tecnicas.ejemploborderpane.dao;

import co.edu.udea.tecnicas.ejemploborderpane.model.Nota;

import java.util.List;

public interface NotaDAO {
    void guardarNota(Nota nota);

    List<Nota> obtenerNotas();
}
