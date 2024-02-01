package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CharacterPlanner extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CharacterPlanner.class.getResource("character-planer.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 885, 755);
        stage.setTitle("Fonline Parareal Character Planner");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}