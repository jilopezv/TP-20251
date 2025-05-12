package co.edu.udea.tecnicas.ejemploborderpane.controller;

import co.edu.udea.tecnicas.ejemploborderpane.model.Estudiante;
import co.edu.udea.tecnicas.ejemploborderpane.service.EstudianteService;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class EstudiantesController {

    @FXML
    private TextField txtId;
    @FXML
    private TextField txtNombres;
    @FXML
    private TextField txtPrograma;
    @FXML
    private Label lblErrores;
    @FXML
    private TableView<Estudiante> tblEstudiantes;
    @FXML
    private TableColumn<Estudiante, String> clmId;
    @FXML
    private TableColumn<Estudiante, String> clmNombres;
    @FXML
    private TableColumn<Estudiante, String> clmPrograma;

    private EstudianteService estudianteService = new EstudianteService();

    public void btnGuardar_action() {
        String id = txtId.getText();
        String nombres = txtNombres.getText();
        String programa = txtPrograma.getText();

        Estudiante estudiante = new Estudiante(id, nombres, programa);

        try {
            estudianteService.guardarEstudiante(estudiante);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Guardado exitoso");
            alert.setHeaderText("Estudiante guardado exitosamente");
            alert.showAndWait();
            lblErrores.setText("");
            // Cargar los estudiantes en la tabla
            tblEstudiantes.setItems(FXCollections.observableList(estudianteService.obtenerEstudiantes()));
        } catch (IllegalArgumentException e) {
            lblErrores.setText(e.getMessage());
        }
    }

    public void initialize() {
        clmId.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getId()));
        clmNombres.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombres()));
        clmPrograma.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPrograma()));

        // Cargar los estudiantes en la tabla
        tblEstudiantes.setItems(FXCollections.observableList(estudianteService.obtenerEstudiantes()));
    }


}
