package controller;

import AllClasses.InParking;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class InParkingFormController {
    public TableView<InParking> tblInParking;
    public TableColumn colVehicalNumber;
    public TableColumn colVehicalType;
    public TableColumn colParkingSlot;
    public TableColumn colParkedTime;
    static ObservableList<InParking> InParking_Vehical=FXCollections.observableArrayList();

    public void initialize(){
        colVehicalNumber.setCellValueFactory(new PropertyValueFactory<>("Vehical_number"));
        colVehicalType.setCellValueFactory(new PropertyValueFactory<>("Vehical_type"));
        colParkingSlot.setCellValueFactory(new PropertyValueFactory<>("Parking_slot"));
        colParkedTime.setCellValueFactory(new PropertyValueFactory<>("Paking_time"));

        tblInParking.setItems(InParking_Vehical);

    }

    public static void setParking_details(String number, String Vehicaltype, String Slot_number, String realTimeAndDate) {
      //  System.out.println(number+" "+Vehicaltype+" "+Slot_number+" "+realTimeAndDate);

        InParking IP=new InParking(number,Vehicaltype,Slot_number,realTimeAndDate);
        InParking_Vehical.add(IP);

    }




}
