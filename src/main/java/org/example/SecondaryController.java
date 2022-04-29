package org.example.client;

import java.io.IOException;
import javafx.fxml.FXML;
import org.example.client.App;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}