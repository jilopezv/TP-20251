package co.edu.udea.tecnicas.ejemploborderpane.controller;

import co.edu.udea.tecnicas.ejemploborderpane.BorderPaneApp;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField txtContrasena;
    @FXML
    private Label lblErrores;

    private BorderPane contenedorPrincipal;

    public void btnIngresar_action() throws IOException {
        System.out.println("Usuario: " + txtUsuario.getText());
        System.out.println("Contraseña: " + txtContrasena.getText());
        if (txtUsuario.getText().isEmpty() || txtContrasena.getText().isEmpty()) {
            lblErrores.setText("Por favor, complete todos los campos.");
        } else if (txtUsuario.getText().length() < 5 || txtContrasena.getText().length() < 5) {
            lblErrores.setText("El usuario y la contraseña deben tener al menos 5 caracteres.");
        } else if (txtUsuario.getText().length() > 20 || txtContrasena.getText().length() > 20) {
            lblErrores.setText("El usuario y la contraseña no pueden exceder los 20 caracteres.");
        } else {
            lblErrores.setText("");
            // Aquí puedes agregar la lógica para verificar el usuario y la contraseña
            System.out.println("Ingreso exitoso");
            FXMLLoader fxmlLoader = new FXMLLoader(BorderPaneApp.class.getResource("view/notasEstudiantes.fxml"));
            Parent estudiantesView = fxmlLoader.load();
            this.contenedorPrincipal.setCenter(estudiantesView);
        }
    }

    public void setContenedorPrincipal(BorderPane contenedorPrincipal) {
        this.contenedorPrincipal = contenedorPrincipal;
    }
}
