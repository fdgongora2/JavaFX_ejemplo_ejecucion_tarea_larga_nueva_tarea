module com.example.ejemplotaskoperacionlarga {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejemplotaskoperacionlarga to javafx.fxml;
    exports com.example.ejemplotaskoperacionlarga;
}