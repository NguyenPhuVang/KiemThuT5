module com.mycompany.nguyenphuvang {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.nguyenphuvang to javafx.fxml;
    exports com.mycompany.nguyenphuvang;
}
