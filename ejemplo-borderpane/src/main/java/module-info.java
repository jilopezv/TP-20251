module co.edu.udea.tecnicas.ejemploborderpane {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens co.edu.udea.tecnicas.ejemploborderpane to javafx.fxml;
    opens co.edu.udea.tecnicas.ejemploborderpane.controller to javafx.fxml;
    exports co.edu.udea.tecnicas.ejemploborderpane;
    exports co.edu.udea.tecnicas.ejemploborderpane.controller;
}