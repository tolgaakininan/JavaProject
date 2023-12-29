module proje.hastaneuygulamasi {
    requires javafx.controls;
    requires javafx.fxml;


    opens proje.hastaneuygulamasi to javafx.fxml;
    exports proje.hastaneuygulamasi;
}