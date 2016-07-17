package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HelloWorld extends Application {

    Label label;

    @Override
    public void start(Stage stage) throws Exception {

        // Component
        label = new Label("This is JavaFX!");
        TextField tf = new TextField();
        tf.setFont(new Font(20));
        tf.setText("TEXT FIELD...");
        Button btn = new Button();
        btn.setText("PUSH BUTTON!");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label.setText("[Pushed] This is JavaFX!");
            }
        });

        // Pane
//        BorderPane pane = new BorderPane();
//        pane.setCenter(label);
        FlowPane pane = new FlowPane();
        pane.setHgap(9);
        pane.setVgap(12);
        pane.getChildren().add(label);
        pane.getChildren().add(tf);
        pane.getChildren().add(btn);

        // Scene
        Scene sc = new Scene(pane, 320, 240);

        // Stage
        stage.setScene(sc);

        stage.show();
    }

}
