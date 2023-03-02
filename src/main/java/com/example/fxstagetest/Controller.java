package com.example.fxstagetest;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

      @FXML
      private WebView webView;

      private String link = getClass().getResource("/window.html").toExternalForm();
      private WebEngine engine;

      @Override
      public void initialize(URL location, ResourceBundle resources) {
            engine = webView.getEngine();
            engine.setJavaScriptEnabled(true);
            engine.load(link);
      }
}
