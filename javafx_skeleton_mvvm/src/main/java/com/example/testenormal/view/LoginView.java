package com.example.testenormal.view;

import com.example.testenormal.App;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.ListProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginView  implements Initializable {

    private StringProperty nome = new SimpleStringProperty("Outra tela com outro controller");
    private ListProperty lista = new SimpleListProperty();

    private HelloViewModel viewModel;

    private App app = App.getInstance();

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        var nee = this.nome.get() + " ioa";
        this.nome.set(nee);
        this.app.changeToMainScene();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        welcomeText.textProperty().bind(this.nome);
        this.nome.addListener( n -> System.out.println("opaaa"));
    }
}