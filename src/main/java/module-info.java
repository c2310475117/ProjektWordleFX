module org.example.projektwordlefx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.projektwordlefx to javafx.fxml;
    exports org.example.projektwordlefx;
}