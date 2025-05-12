package co.edu.udea.tecnicas.ejemploborderpane.dao;

import co.edu.udea.tecnicas.ejemploborderpane.model.Estudiante;

import java.util.ArrayList;
import java.util.List;

// Data Access Object (DAO) para manejar la persistencia de estudiantes
public class EstudianteDAO {
    // Simulación de una base de datos
    private static final List<Estudiante> estudiantesDB = new ArrayList<>();

    public EstudianteDAO() {
        // Inicializar la base de datos con algunos estudiantes
        estudiantesDB.add(new Estudiante("1", "Juan Pérez", "Ingeniería de Sistemas"));
        estudiantesDB.add(new Estudiante("2", "María Gómez", "Ingeniería Electrónica"));
        estudiantesDB.add(new Estudiante("3", "Carlos López", "Ingeniería Industrial"));
    }

    public void guardarEstudiante(Estudiante estudiante) {
        estudiantesDB.add(estudiante);
    }

    public List<Estudiante> obtenerEstudiantes() {
        return estudiantesDB;
    }

}
