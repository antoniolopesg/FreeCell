package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static Stage screen;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        screen = primaryStage;
        screen.setTitle("FreeCell - Antonio Lopes && Weverton Pereira");
        screen.setScene(new Scene(root, 748, 600));
        screen.setResizable(false);
        screen.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
