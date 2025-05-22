package co.edu.udea.tecnicas.ejemploborderpane.controller;

import co.edu.udea.tecnicas.ejemploborderpane.BorderPaneApp;
import javafx.event.ActionEvent;
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
        FXMLLoader fxmlLoader = new FXMLLoader(BorderPaneApp.class.getResource("view/estudiantes.fxml"));
        Parent estudiantesView = fxmlLoader.load();
        contenedorPrincipal.setCenter(estudiantesView);
        /*Parent loginView = fxmlLoader.load();
        contenedorPrincipal.setCenter(loginView);
        LoginController loginController = fxmlLoader.getController();
        loginController.setContenedorPrincipal(contenedorPrincipal);*/
    }

    public void mnuCerrar_action(ActionEvent actionEvent) {
        System.out.println("Cerrando app desde el menú");
        System.exit(0);
    }

    public void mnuRegistrarNotas_action(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BorderPaneApp.class.getResource("view/notas.fxml"));
        Parent notasView = fxmlLoader.load();
        contenedorPrincipal.setCenter(notasView);
    }

    public void mnuRegistrarEstudiantes_action(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BorderPaneApp.class.getResource("view/estudiantes.fxml"));
        Parent estudiantesView = fxmlLoader.load();
        contenedorPrincipal.setCenter(estudiantesView);
    }

    public void mnu_AsignarNotasEstudiantes_action(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BorderPaneApp.class.getResource("view/notasEstudiantes.fxml"));
        Parent notasEstudiantesView = fxmlLoader.load();
        contenedorPrincipal.setCenter(notasEstudiantesView);
    }
}
