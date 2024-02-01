module com.example.characterplanner {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.swing;


    opens sample to javafx.fxml;
    exports sample;
}