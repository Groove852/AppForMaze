module com.example.appformaze {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.appformaze to javafx.fxml;
    exports com.example.appformaze;
    exports com.example.appformaze.controller;
    opens com.example.appformaze.controller to javafx.fxml;
}