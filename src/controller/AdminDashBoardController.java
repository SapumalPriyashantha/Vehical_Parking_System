package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AdminDashBoardController {
    public AnchorPane pic2;

    public void InParkingData(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/InParkingForm.fxml");
        Parent load = FXMLLoader.load(resource);
        pic2.getChildren().clear();
        pic2.getChildren().add(load);
    }

    public void OnDeliveryData(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/OndriverShiftForm.fxml");
        Parent load = FXMLLoader.load(resource);
        pic2.getChildren().clear();
        pic2.getChildren().add(load);
    }

    public void AddVehicalData(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddVehicalForm.fxml");
        Parent load = FXMLLoader.load(resource);
        pic2.getChildren().clear();
        pic2.getChildren().add(load);
    }

    public void AddDriverData(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddDriverForm.fxml");
        Parent load = FXMLLoader.load(resource);
        pic2.getChildren().clear();
        pic2.getChildren().add(load);
    }

    public void GotoDashBoard(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) pic2.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
