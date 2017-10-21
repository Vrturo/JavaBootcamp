package com.codefellows;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class ControlPane extends VBox {
    private Button lineButton, quitButton;

    public ControlPane() {
        lineButton = new Button("Line");
        quitButton = new Button("Quit");

        getChildren().add(lineButton);
        getChildren().add(quitButton);

        setPrefWidth(400);

         quitButton.setOnAction(e -> {
            Platform.exit();
            System.exit(0);
         });
    }

//    public VBox addVbox() {
//        VBox vbox = new VBox();
//        Text title = new Text("Data");
//
//        vbox.getChildren().add(title);
//        Hyperlink options[] = new Hyperlink[]{
//                new Hyperlink("One"),
//                new Hyperlink("Two"),
//                new Hyperlink("Three"),
//                new Hyperlink("Four")};
//
//        return vbox;
//    }
}
