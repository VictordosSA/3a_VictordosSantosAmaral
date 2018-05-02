/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author 04592828240
 */
public class MenuPrincipalController implements Initializable {

    @FXML
    private JFXTextField txtNumero, txtNumero2, txtResultado;

    @FXML

    private JFXButton btnSoma;

    @FXML
    private void soma(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNumero.getText());
        Double num2 = Double.parseDouble(txtNumero2.getText());
        Double resultado = num1 + num2;

        txtResultado.setText(resultado.toString());

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
