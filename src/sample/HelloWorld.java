package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HelloWorld extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Label message = new Label(("Hello JavaFX!"));
        message.setFont(new Font(100));

        stage.setScene(new Scene(message));
        stage.setTitle("HELLO");
        stage.show();
    }

}
