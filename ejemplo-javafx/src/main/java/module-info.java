module co.edu.udea.tecnicas.ejemplojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens co.edu.udea.tecnicas.ejemplojavafx to javafx.fxml;
    exports co.edu.udea.tecnicas.ejemplojavafx;
}