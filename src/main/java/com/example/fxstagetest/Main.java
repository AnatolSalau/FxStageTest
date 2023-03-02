package com.example.fxstagetest;

import ch.micheljung.fxwindow.FxStage;
import ch.micheljung.waitomo.WaitomoTheme;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application{
  public static void main(String[] args) {
    launch( args);
  }


  @Override
  public void init() throws Exception {

  }

  @Override
    public void start(Stage primaryStage) throws IOException {
    StackPane root = FXMLLoader.load(getClass().getResource("/fxml/window.fxml"));

      FxStage.configure(primaryStage)
            .withContent(root)
        .apply();
      Scene scene = primaryStage.getScene();

      //WaitomoTheme.apply(scene);
      scene.getStylesheets().add(getClass().getResource("/css/window.css").toExternalForm());
      Image image = new Image("/png/rts.png");
      primaryStage.getIcons().add(image);
      primaryStage.setTitle("Title");
      primaryStage.show();
    }
  }

