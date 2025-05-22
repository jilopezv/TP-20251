package co.edu.udea.tecnicas.ejemploborderpane.controller;

import co.edu.udea.tecnicas.ejemploborderpane.model.Nota;
import co.edu.udea.tecnicas.ejemploborderpane.service.NotaService;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class NotasController {

    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtDescripcion;
    @FXML
    private TextField txtPorcentaje;
    @FXML
    private Label lblErrores;
    @FXML
    private TableView<Nota> tblNotas;
    @FXML
    private TableColumn<Nota, String> clmNombre;
    @FXML
    private TableColumn<Nota, String> clmDescripcion;
    @FXML
    private TableColumn<Nota, Float> clmPorcentaje;

    private NotaService notaService = new NotaService();


    public void btnGuardar_action(ActionEvent actionEvent) {
        String nombre = txtNombre.getText();
        String descripcion = txtDescripcion.getText();
        Float porcentaje = Float.parseFloat(txtPorcentaje.getText());

        Nota nota = new Nota(nombre, descripcion, porcentaje);

        try {
            notaService.guardarNota(nota);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Guardado exitoso");
            alert.setHeaderText("Nota guardada exitosamente");
            alert.showAndWait();
            lblErrores.setText("");
            // Cargar los estudiantes en la tabla
            tblNotas.setItems(FXCollections.observableList(notaService.obtenerNotas()));
        } catch (IllegalArgumentException e) {
            lblErrores.setText(e.getMessage());
        }
    }

    public void initialize() {
        clmNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        clmDescripcion.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDescripcion()));
        clmPorcentaje.setCellValueFactory(cellData -> new SimpleFloatProperty(cellData.getValue().getPorcentaje()).asObject());

        // Cargar los estudiantes en la tabla
        tblNotas.setItems(FXCollections.observableList(notaService.obtenerNotas()));
    }
}
