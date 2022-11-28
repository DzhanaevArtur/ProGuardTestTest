package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;
import people.human.*;
import people.women.*;

@Slf4j
public class Main extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {

        log.info("\n"); new Artur(5, 30_000);
        log.info("\n"); new Marat(3, 50_000);
        log.info("\n"); new Geor(20, 100_000);
        log.info("\n"); new Marina(0, true, "pies");
        log.info("\n"); new Milana(2, true, "beefBurger");
        log.info("\n"); new Irina (5, false, "creamCheese");

        final int backgroundRadius = 10, prefHeight = 200, prefWidth = 900;
        AnchorPane wht1 = new AnchorPane(); wht1.setStyle(String.format("-fx-background-color: #ffffff; -fx-background-radius: %d; -fx-pref-height: %d; -fx-pref-width: %d", backgroundRadius, prefHeight, prefWidth));
        AnchorPane wht2 = new AnchorPane(); wht2.setStyle(String.format("-fx-background-color: #ffffff; -fx-background-radius: %d; -fx-pref-height: %d; -fx-pref-width: %d", backgroundRadius, prefHeight, prefWidth));
        AnchorPane red1 = new AnchorPane(); red1.setStyle(String.format("-fx-background-color: #ff0000; -fx-background-radius: %d; -fx-pref-height: %d; -fx-pref-width: %d", backgroundRadius, prefHeight, prefWidth));
        AnchorPane red2 = new AnchorPane(); red2.setStyle(String.format("-fx-background-color: #ff0000; -fx-background-radius: %d; -fx-pref-height: %d; -fx-pref-width: %d", backgroundRadius, prefHeight, prefWidth));
        AnchorPane yel0 = new AnchorPane(); yel0.setStyle(String.format("-fx-background-color: #ffff00; -fx-background-radius: %d; -fx-pref-height: %d; -fx-pref-width: %d", backgroundRadius, prefHeight, prefWidth));
        AnchorPane blu0 = new AnchorPane(); blu0.setStyle(String.format("-fx-background-color: #0000ff; -fx-background-radius: %d; -fx-pref-height: %d; -fx-pref-width: %d", backgroundRadius, prefHeight, prefWidth));

        VBox iry = new VBox(wht1, red1, yel0); iry.setStyle("-fx-border-style: solid inside; -fx-border-width: 1; -fx-border-color: black;");
        VBox rus = new VBox(wht2, blu0, red2); rus.setStyle("-fx-border-style: solid inside; -fx-border-width: 1; -fx-border-color: black;");
        stage.setScene(new Scene(new HBox(iry, rus)));
        stage.setTitle("Brothers");
        stage.setResizable(false);
        stage.setAlwaysOnTop(true);
        stage.setX(Screen.getPrimary().getBounds().getWidth() * 0.5 - prefWidth);
        stage.setY(Screen.getPrimary().getBounds().getHeight() * 0.5 - (prefHeight * iry.getChildren().size() * 0.5));
        stage.show();

    }
}
