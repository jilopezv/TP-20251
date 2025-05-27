package co.edu.udea.tecnicas.ejemploborderpane.service;

import co.edu.udea.tecnicas.ejemploborderpane.dao.NotaDAO;
import co.edu.udea.tecnicas.ejemploborderpane.dao.impl.NotaDAOIO;
import co.edu.udea.tecnicas.ejemploborderpane.dao.impl.NotaDAOList;
import co.edu.udea.tecnicas.ejemploborderpane.model.Nota;

import java.util.List;

public class NotaService {
    private NotaDAO notaDAO = new NotaDAOIO();

    public void guardarNota(Nota nota) throws IllegalArgumentException {
        // Validar la nota antes de guardarla (reglas de negocio)
        // TODO: validar que la suma de las notas almacenadas y la nueva que se va
        // a almacenar no supere 1
        if (nota.getNombre().isBlank() || nota.getDescripcion().isBlank()
                || nota.getPorcentaje() <= 0 || nota.getPorcentaje() > 1) {
            throw new IllegalArgumentException("Los campos no pueden estar vacíos");
        }
        // Guardar la nota en la base de datos
        notaDAO.guardarNota(nota);
    }

    public List<Nota> obtenerNotas() {
        return notaDAO.obtenerNotas();
    }
}
