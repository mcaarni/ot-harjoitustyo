package org.openjfx.laskinfx;

import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    Laskenta l = new Laskenta();

    @FXML
    private TextField vastauskentta;

    @FXML
    private Button kahdeksan;

    @FXML
    private Button yhdrksan;

    @FXML
    private Button nelja;

    @FXML
    private Button viisi;

    @FXML
    private Button kuusi;

    @FXML
    private Button yksi;

    @FXML
    private Button kaksi;

    @FXML
    private Button kolme;

    @FXML
    private Button nolla;

    @FXML
    private Button piste;

    @FXML
    private Button yhtasuuri;

    @FXML
    private Button seisteman;

    @FXML
    private Button c;

    @FXML
    private Button yhteen;

    @FXML
    private Button vahennys;

    @FXML
    private Button jako;

    @FXML
    private Button kerto;

    @FXML
    private Button nelio;

    @FXML
    private Button potenssi;

    @FXML
    private Button ac;

    double vastaus = 0;
    double syotto1;
    double syotto2;
    int ps;
    int point;

    @FXML
    void Lakutoimitus(ActionEvent event) {
        if (event.getSource() == yksi) {
            vastauskentta.appendText("1");
        } else if (event.getSource() == kaksi) {
            vastauskentta.appendText("2");
        } else if (event.getSource() == kolme) {
            vastauskentta.appendText("3");
        } else if (event.getSource() == nelja) {
            vastauskentta.appendText("4");
        } else if (event.getSource() == viisi) {
            vastauskentta.appendText("5");
        } else if (event.getSource() == kuusi) {
            vastauskentta.appendText("6");
        } else if (event.getSource() == seisteman) {
            vastauskentta.appendText("7");
        } else if (event.getSource() == kahdeksan) {
            vastauskentta.appendText("8");
        } else if (event.getSource() == yhdrksan) {
            vastauskentta.appendText("9");
        } else if (event.getSource() == nolla) {
            vastauskentta.appendText("0");
        } else if (event.getSource() == piste && point == 0) {
            vastauskentta.appendText(".");
            point = 1;
        } else if (event.getSource() == ac) {
            vastauskentta.setText("");
            syotto1 = 0;
            syotto2 = 0;
            ps = 0;
            point = 0;
        } else if (event.getSource() == c) {
            if (l.onkoSisaltoa(vastauskentta.getText())) {
                vastauskentta.setText(vastauskentta.getText().substring(0, vastauskentta.getText().length() - 1));
            }
        } else if (event.getSource() == yhteen) {
            syotto1 = Double.parseDouble(vastauskentta.getText());
            vastauskentta.setText("");
            ps = 1;
            point = 0;
        } else if (event.getSource() == vahennys) {
            syotto1 = Double.parseDouble(vastauskentta.getText());
            vastauskentta.setText("");
            ps = 2;
            point = 0;
        } else if (event.getSource() == kerto) {
            syotto1 = Double.parseDouble(vastauskentta.getText());
            vastauskentta.setText("");
            ps = 3;
            point = 0;
        } else if (event.getSource() == jako) {
            syotto1 = Double.parseDouble(vastauskentta.getText());
            vastauskentta.setText("");
            ps = 4;
            point = 0;
        } else if (event.getSource() == potenssi) {
            syotto1 = Double.parseDouble(vastauskentta.getText());
            vastauskentta.setText("");
            ps = 5;
            point = 0;
        } else if (event.getSource() == nelio) {
            syotto1 = Double.parseDouble(vastauskentta.getText());
            vastauskentta.setText("");
            ps = 6;
            point = 0;
        } else if (event.getSource() == yhtasuuri && ps > 0) {
            syotto2 = Double.parseDouble(vastauskentta.getText());

            if (String.valueOf(l.lasku(ps, syotto1, syotto2)).isEmpty() || String.valueOf(l.lasku(ps, syotto1, syotto2)) == null) {
                vastauskentta.setText("Math Error");
            } else {
                vastauskentta.setText(String.valueOf(l.lasku(ps, syotto1, syotto2)));
                syotto1 = Integer.valueOf(vastauskentta.getText());
            }
            vastauskentta.clear();
            ps = 0;
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        vastauskentta.setText("");
    }
}
