package com.example.test2;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TestController {
    @FXML
    private Label mylabel;

    @FXML
    private Button mybtnId;

    @FXML
    private  void clickMeLeon()
    {
        System.out.println("Hello Leon,You just clicked me!");
        mybtnId.setText("clicked");
    }
    @FXML
    private  void  callAlert()
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alert");
        alert.setHeaderText(null);
        alert.setContentText("This is an alert box!");
        alert.showAndWait();
    }

}
