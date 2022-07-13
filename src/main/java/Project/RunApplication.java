package Project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class RunApplication extends Application {
    public void start(Stage primaryStage) throws IOException {
        URL fxmlLocation = getClass().getResource("Group_Project.fxml");
        FXMLLoader fxml = new FXMLLoader(fxmlLocation);
        Scene scene = new Scene(fxml.load());
        primaryStage.setTitle("Challenge 1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
