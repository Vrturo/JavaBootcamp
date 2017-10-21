package com.codefellows;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class Paint extends Application {
    public static void main( String[] args ) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Hellow, Java 501!");
        Button btn = new Button();
        btn.setText("please don't click me");

        VBox root = new VBox();
        root.getChildren().add(btn);

        Label lbl = new Label("This is a label");
        lbl.setVisible(false);
        root.getChildren().add(lbl);

        btn.setOnAction(e -> {
            if(lbl.isVisible()) {
                lbl.setVisible(false);
            } else {
                lbl.setVisible(true);
            }
        });

        Scene scene = new Scene(root,300, 250);
        stage.setScene(scene);

        stage.show();
    }
}
