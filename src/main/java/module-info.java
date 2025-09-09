module com.niccolo.gestione_libreria {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.niccolo.gestione_libreria to javafx.fxml;
    exports com.niccolo.gestione_libreria;
}