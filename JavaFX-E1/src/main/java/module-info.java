module com.c2306l.javafxe1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.c2306l.javafxe1 to javafx.fxml;
    exports com.c2306l.javafxe1;
    exports com.c2306l.javafxe1.Controller;
    opens com.c2306l.javafxe1.Controller to javafx.fxml;
}