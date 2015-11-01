package com.zygimantus.javafxapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class FXMLController implements Initializable {

    private static final Logger logger = LogManager.getLogger();

    @FXML
    private Label label;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        logger.info("You clicked me!");
        label.setText("Hello World!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
