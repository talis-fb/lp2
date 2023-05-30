module com.example.demo1_javafx_maven {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.demo1_javafx_maven to javafx.fxml;
    exports com.example.demo1_javafx_maven;
}