/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXToggleButton;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 *
 * @author Passant
 */
public class ClientInfoController {
    @FXML private JFXTextField clientFullName;
    @FXML private JFXTextField clientName;
    @FXML private JFXTextField clientEmail;
    @FXML private JFXPasswordField clientPassword;
    @FXML private JFXToggleButton clientGender;
    @FXML private JFXDatePicker clientDob;
    @FXML private JFXComboBox clientStatus;
    @FXML private JFXComboBox clientCountry;
    @FXML private Label hintMessage;
    @FXML private JFXButton cancelBtn;
    @FXML private JFXButton saveAllChangesBtn;
    
            
}
