package com.codefellows;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
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
        stage.setTitle("Let's Code w/ a twist");
//        Button btn = new Button();
//        btn.setText("please don't click me");
//
//        VBox root = new VBox();
//        root.getChildren().add(btn);
//
//        Label lbl = new Label("This is a label");
//        lbl.setVisible(false);
//        root.getChildren().add(lbl);
//
//        btn.setOnAction(e -> {
//            if(lbl.isVisible()) {
//                lbl.setVisible(false);
//            } else {
//                lbl.setVisible(true);
//            }
//        });
//
//        Scene scene = new Scene(root,300, 250);
//        stage.setScene(scene);
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 400, 400);

        ControlPane cPane = new ControlPane();
        root.getChildren().add(cPane);
//        root.setLeft(cPane);

//        VBox lseft(lBox);



        // add control pane
        // add paint pane


        stage.setScene(scene);
        stage.show();
    }
}
