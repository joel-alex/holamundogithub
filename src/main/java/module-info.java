module com.mycompany.holamundogithub {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.holamundogithub to javafx.fxml;
    exports com.mycompany.holamundogithub;
}