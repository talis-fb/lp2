package com.example.testenormal.view;

import com.example.testenormal.App;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloView implements Initializable {
    private App app = App.getInstance();
    private HelloViewModel viewModel = HelloViewModel.getInstance();

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        var novoValor = this.viewModel.getHelloMessage() + " -opa-";
        this.viewModel.setHelloMessage(novoValor);
        this.app.changeToLoginScene();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        welcomeText.textProperty().bind(this.viewModel.helloMessage());
        this.viewModel.helloMessage().addListener( n -> System.out.println("opaaa"));
    }
}