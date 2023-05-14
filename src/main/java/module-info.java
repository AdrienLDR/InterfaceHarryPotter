module com.example.rpg_javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;


    opens com.example.rpg_javafx to javafx.fxml;
    exports com.example.rpg_javafx;
}