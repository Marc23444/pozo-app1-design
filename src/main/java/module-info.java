module com.example.applicationassignment1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens baseline.Application to javafx.fxml;
    exports baseline.Application;
}