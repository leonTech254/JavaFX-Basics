package com.example.test2;

import javafx.fxml.FXML;
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

}
