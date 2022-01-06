package controller;

import AllClasses.Demo;
import AllClasses.Driver;
import AllClasses.DriverQueue;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class AddDriverFormController {

    public TextField txtDriverName;
    public TextField txtNIC;
    public TextField txtDLN;
    public TextField txtAddress;
    public TextField txtContactNo;

    public void AddDriver(ActionEvent actionEvent) {
        DriverQueue DQ= Demo.get_Driverreference();
        String drivername= txtDriverName.getText();
        String nic= txtNIC.getText();
        String dln= txtDLN.getText();
        String address= txtAddress.getText();
        String contactNo= txtContactNo.getText();
        DQ.add_another_driver(new Driver(drivername,nic,dln,address,contactNo));
    }
}
