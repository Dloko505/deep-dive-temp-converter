package edu.cnm.deepdive.temperature;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

  private static final String WINDOW_TITLE = "Temperature Converter";

  @Override
  public void start(Stage stage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("resouces/main.fxml"));
    stage.setTitle(WINDOW_TITLE);
    stage.setScene(new Scene(root, 300, 275));
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
