package com.example.test2;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TestController {
    @FXML
    private Label mylabel;

    @FXML
    private Button mybtnId;
    @FXML
    private TextField mytexField;

    @FXML
    private  void clickMeLeon()
    {
        System.out.println("Hello Leon,You just clicked me!");
        mybtnId.setText("clicked");
    }
    @FXML
    private  void  callAlert()
    {
        System.out.println(mytexField.getText());

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alert");
        alert.setHeaderText(null);
        alert.setContentText("This is an alert box!");
        alert.showAndWait();
    }

}
