package co.edu.udea.tecnicas.ejemplojavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {


    @FXML
    private Label welcomeText;
    private boolean toggle;

    public void onHelloButtonClick() {
        if (!toggle) {
            welcomeText.setText("Bienvenido a JavaFX!");
        } else {
            welcomeText.setText("");
        }
        toggle = !toggle;
    }
}