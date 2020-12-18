module org.openjfx.laskinfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.openjfx.laskinfx to javafx.fxml;
    exports org.openjfx.laskinfx;
}