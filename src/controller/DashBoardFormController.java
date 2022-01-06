package controller;

import AllClasses.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;



public class DashBoardFormController {

    public AnchorPane pic1;
    String selectedVehical;
    String selectedDriver;
    public Label lblParkinfSlot;
    public Label lblDateAndTime;
    public Button btnParkVehical;
    public Button btnOnDiliveryShift;
    private static String realTimeAndDate;
    String findVehicaltype;
    String findDriverNIC;
    String parkingSlot_number;
    Vehical[] vehical_data;
    Driver[] driver_data;

    public ComboBox<String> cmbSelectVehical;
    public TextField txtVehicalType;
    public ComboBox<String> cmbDriver;


    public void initialize() {
        vehical_data=VehicalQueue.get_array();
         for (int i=0;i<vehical_data.length;i++){
            cmbSelectVehical.getItems().addAll(vehical_data[i].getVehical_number());
         }

        driver_data=DriverQueue.get_array();
           for (int i=0;i<driver_data.length;i++){
            cmbDriver.getItems().addAll(driver_data[i].getDriver_name());
           }
       /* cmbSelectVehical.getItems().addAll(
                "NA-3434",
                "KA-4563",
                "58-3567",
                "GF-4358",
                "CCB-3568",
                "LM-6679",
                "QA-3369",
                "KB-3668",
                "JJ-9878",
                "GH-5772",
                "XY-4456",
                "YQ-3536",
                "CBB-3566",
                "QH-3444"
        );

        cmbDriver.getItems().addAll(
                "Sumith Kumara",
                "Amila Pathirana",
                "Jithmal Perera",
                "Sumith Dissanayaka",
                "Sumanasiri Herath",
                "Awantha Fernando",
                "Charith Sudara",
                "Prashan Dineth",
                "Chethiya Dilan",
                "Dushantha Perera",
                "Sumith Udayanga",
                "Dinesh Udara",
                "Udana Chathuranga",
                "Mohommad Riaz",
                "Sandun Kumara",
                "Priyanga Perera"
        ); */
        lblDateAndTime.setText(realTimeAndDate);
        btnParkVehical.setVisible(false);
        btnOnDiliveryShift.setVisible(false);


    }
    public void gotoParkVehicalArray() {

        lblParkinfSlot.setText("        Parked");
        Admin_Inparking();
    }

    public void gotoOndeliveryArray() {
        lblParkinfSlot.setText("        Delivery");
        Admin_OndriveShift();
    }



    public void SelectVehical(ActionEvent actionEvent) {
        selectedVehical =cmbSelectVehical.getSelectionModel().getSelectedItem();
        findVehicaltype=VehicalQueue.findVehicalType(selectedVehical);
        txtVehicalType.setText(findVehicaltype);
      //  btnParkVehical.setVisible(true);

    }


    public void selectDriver(ActionEvent actionEvent) {
        selectedDriver= cmbDriver.getSelectionModel().getSelectedItem();
        findDriverNIC=DriverQueue.findDriverNIC(selectedDriver);
        VehicalQueue.setDriverNIC(selectedVehical,findDriverNIC);

        getParkingSlotNumber();
    }
    public static void secondMethod(String args[]){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date date = new Date();
        realTimeAndDate=formatter.format(date);
    }
    public void getParkingSlotNumber(){
        parkingSlot_number=ParkingSlotQueue.findVehicalSlot(findVehicaltype,selectedVehical);
      //  lblParkinfSlot.setText(parkingSlot_number);
        if(parkingSlot_number.equals("x")){
            btnOnDiliveryShift.setVisible(true);
            btnParkVehical.setVisible(false);
           // System.out.println("out");
        }else{
            lblParkinfSlot.setText(parkingSlot_number);
            btnParkVehical.setVisible(true);
            btnOnDiliveryShift.setVisible(false);

        }
    }

    public void openLogin(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/LoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) pic1.getScene().getWindow();
        window.setScene(new Scene(load));
    }
    public void Admin_Inparking(){
        InParkingFormController.setParking_details(selectedVehical,findVehicaltype,parkingSlot_number,realTimeAndDate);
    }
    public void Admin_OndriveShift(){
        OndriverShiftFormController.setOnDriverShift_details(selectedVehical,findVehicaltype,selectedDriver,realTimeAndDate);
    }

}
