module ism.inscription {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens ism.inscription to javafx.fxml;
    exports ism.inscription;
}
