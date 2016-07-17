package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HelloWorld extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // Component
        Label label = new Label("This is JavaFX!");

        // Pane
        BorderPane bp = new BorderPane();
        bp.setCenter(label);

        // Scene
        Scene sc = new Scene(bp, 320, 240);

        // Stage
        stage.setScene(sc);

        stage.show();
    }

}
