package com.example.test2;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class TestController {
    @FXML
    private Label mylabel;

    @FXML
    private Button mybtnId;
    @FXML
    private TextField mytexField;

    @FXML
    private CheckBox agrements;
    @FXML
    private RadioButton maleRadioButton;

    @FXML
    private RadioButton femaleRadioButton;

    @FXML
    private RadioButton otherRadioButton;

    private ToggleGroup genderToggleGroup;

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

    @FXML
    private void  onthecheckBox()
    {
        System.out.println(agrements.isSelected());
    }


    @FXML
    public void initialize() {
        genderToggleGroup = new ToggleGroup();
        maleRadioButton.setToggleGroup(genderToggleGroup);
        femaleRadioButton.setToggleGroup(genderToggleGroup);
        otherRadioButton.setToggleGroup(genderToggleGroup);

        maleRadioButton.setSelected(true);
    }

}
