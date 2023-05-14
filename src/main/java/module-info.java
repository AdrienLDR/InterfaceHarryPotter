module com.example.rpg_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rpg_javafx to javafx.fxml;
    exports com.example.rpg_javafx;
}