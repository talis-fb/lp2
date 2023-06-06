module com.example.testenormal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testenormal to javafx.fxml;
    exports com.example.testenormal;
    exports com.example.testenormal.view;
    opens com.example.testenormal.view to javafx.fxml;
    exports com.example.testenormal.shared;
    opens com.example.testenormal.shared to javafx.fxml;
}