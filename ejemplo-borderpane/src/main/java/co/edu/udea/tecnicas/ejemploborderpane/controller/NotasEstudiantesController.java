package co.edu.udea.tecnicas.ejemploborderpane.controller;

import co.edu.udea.tecnicas.ejemploborderpane.model.Estudiante;
import co.edu.udea.tecnicas.ejemploborderpane.model.Nota;
import co.edu.udea.tecnicas.ejemploborderpane.service.EstudianteService;
import co.edu.udea.tecnicas.ejemploborderpane.service.NotaService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class NotasEstudiantesController {

    @FXML
    private ComboBox<Estudiante> cmbEstudiantes;
    @FXML
    private ComboBox<Nota> cmbNotas;
    @FXML
    private TextField txtValor;

    private EstudianteService estudianteService = new EstudianteService();
    private NotaService notaService = new NotaService();


    public void btnGuardar_action(ActionEvent actionEvent) {
        //todo agregar lógica de guardado
    }

    public void initialize(){
        // Cargar los estudiantes en el ComboBox
        cmbEstudiantes.getItems().addAll(estudianteService.obtenerEstudiantes());
        // Cargar las notas en el ComboBox
        cmbNotas.getItems().addAll(notaService.obtenerNotas());
    }
}
