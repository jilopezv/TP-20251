package co.edu.udea.tecnicas.ejemploborderpane.service;

import co.edu.udea.tecnicas.ejemploborderpane.dao.EstudianteDAO;
import co.edu.udea.tecnicas.ejemploborderpane.model.Estudiante;

import java.util.List;

public class EstudianteService {

    private EstudianteDAO estudianteDAO = new EstudianteDAO();


    public void guardarEstudiante(Estudiante estudiante) throws IllegalArgumentException {
        // Validar el estudiante antes de guardarlo (reglas de negocio)
        if (estudiante.getId().isBlank()|| estudiante.getNombres().isBlank()|| estudiante.getPrograma().isBlank()) {
            throw new IllegalArgumentException("Los campos no pueden estar vacíos");
        }
        // Guardar el estudiante en la base de datos
        estudianteDAO.guardarEstudiante(estudiante);
    }

    public List<Estudiante> obtenerEstudiantes() {

        return estudianteDAO.obtenerEstudiantes();
    }

}
