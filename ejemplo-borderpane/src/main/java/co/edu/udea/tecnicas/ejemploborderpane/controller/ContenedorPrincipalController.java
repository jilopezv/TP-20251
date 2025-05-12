package co.edu.udea.tecnicas.ejemploborderpane.controller;

import co.edu.udea.tecnicas.ejemploborderpane.BorderPaneApp;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class ContenedorPrincipalController {

    @FXML
    private BorderPane contenedorPrincipal;

    public ContenedorPrincipalController(){
        System.out.println("Constructor de ContenedorPrincipalController invocado");
        System.out.println("FXML: " + contenedorPrincipal);
    }

    // postconstruct
    public void initialize() throws IOException {
        System.out.println("Método initialize invocado");
        System.out.println("FXML: " + contenedorPrincipal);
        FXMLLoader fxmlLoader = new FXMLLoader(BorderPaneApp.class.getResource("view/login.fxml"));
        Parent loginView = fxmlLoader.load();
        contenedorPrincipal.setCenter(loginView);
        LoginController loginController = fxmlLoader.getController();
        loginController.setContenedorPrincipal(contenedorPrincipal);
    }

}
