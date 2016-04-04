package ui.login;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    public TextField username;
    public PasswordField password;
    public Label title;

    public void login(ActionEvent actionEvent) {
        System.out.println("Login!");
    }

    public void register(ActionEvent actionEvent) {
        System.out.println("Register!");
    }

    public void cancel(ActionEvent actionEvent) {
        System.exit(0);
    }
}
