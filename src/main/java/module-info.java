module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires io.netty.codec;
    requires java.desktop;
    requires jdk.xml.dom;
    requires org.apache.commons.io;
    opens org.example to javafx.fxml;
    exports org.example;
    exports org.example.client;
    opens org.example.client to javafx.fxml;

}
