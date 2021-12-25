package com.example.appformaze;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class AppForMaze extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AppForMaze.class.getResource("/com/example/appformaze/fxmls/hello-view.fxml"));
        InputStream iconStream = getClass().getResourceAsStream("/com/example/appformaze/png/icon.png");

        assert iconStream != null;
        Image image = new Image(iconStream);
        Scene scene = new Scene(fxmlLoader.load(), 1380, 924);

        stage.getIcons().add(image);
        stage.setResizable(false);
        stage.setTitle("Maze Analytic system beta");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}