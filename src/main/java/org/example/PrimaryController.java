package org.example.client;

import java.io.IOException;
import javafx.fxml.FXML;
import org.example.client.App;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
