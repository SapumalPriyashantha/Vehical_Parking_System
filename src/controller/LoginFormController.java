package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginFormController  {
    public AnchorPane pic2;
    public JFXTextField txtusername;
    public JFXTextField txtpassword;

    public void backToDashBoard(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) pic2.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openAdminDashBoard(ActionEvent actionEvent) throws IOException {
        String username="Admin";
        String password="Admin";
        String check_username=txtusername.getText();
        String check_password=txtpassword.getText();
        if(username.equals(check_username) && password.equals(check_password)) {
            URL resource = getClass().getResource("../view/AdminDashBoard.fxml");
            Parent load = FXMLLoader.load(resource);
            Stage window = (Stage) pic2.getScene().getWindow();
            window.setScene(new Scene(load));
        }else {
            URL resource = getClass().getResource("../view/DashBoardForm.fxml");
            Parent load = FXMLLoader.load(resource);
            Stage window = (Stage) pic2.getScene().getWindow();
            window.setScene(new Scene(load));
        }
    }
}
