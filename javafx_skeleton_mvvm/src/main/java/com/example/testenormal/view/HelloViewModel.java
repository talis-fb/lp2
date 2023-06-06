package com.example.testenormal.view;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class HelloViewModel {
    // Singleton ----------
    private static HelloViewModel instance = new HelloViewModel();
    private HelloViewModel() {}
    public static HelloViewModel getInstance() {
        return HelloViewModel.instance;
    }
    // -----------------


    private final StringProperty helloMessage = new SimpleStringProperty("Hello World");

    public StringProperty helloMessage() {
        return helloMessage;
    }

    public String getHelloMessage() {
        return helloMessage.get();
    }

    public void setHelloMessage(String message) {
        helloMessage.set(message);
    }


}
