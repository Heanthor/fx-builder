package ui.main;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class MainController {

    public TextArea textarea;
    public TextField input;
    public ListView userlist;
    public FXCollections listContents;

    public void send(ActionEvent actionEvent) {
        System.out.println("Send");
    }

    public void logout(ActionEvent actionEvent) {
        System.out.println("Logout");
    }

    public void attachImage(ActionEvent actionEvent) {
        System.out.println("Attach");
    }
}
