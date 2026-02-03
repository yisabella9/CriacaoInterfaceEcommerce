module com.example.paginadelogin {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.paginadelogin to javafx.fxml;
    opens com.example.paginadelogin.controller to javafx.fxml;

    exports com.example.paginadelogin;
}