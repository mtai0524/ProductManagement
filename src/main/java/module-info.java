module com.views.pm {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.views.pm to javafx.fxml;
    exports com.views.pm;
}