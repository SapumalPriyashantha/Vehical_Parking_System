package controller;

import AllClasses.InParking;
import AllClasses.OndriverShift;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class OndriverShiftFormController {

    public TableView<OndriverShift> tblOnDriverShift;
    public TableColumn colVehicalNumber;
    public TableColumn colVehicalType;
    public TableColumn colDriverName;
    public TableColumn colLeftTime;
    public AnchorPane pic1;
    static ObservableList<OndriverShift> OnDriverShift_Vehical= FXCollections.observableArrayList();



    public void initialize(){
        colVehicalNumber.setCellValueFactory(new PropertyValueFactory<>("Vehical_number"));
        colVehicalType.setCellValueFactory(new PropertyValueFactory<>("Vehical_type"));
        colDriverName.setCellValueFactory(new PropertyValueFactory<>("Driver_name"));
        colLeftTime.setCellValueFactory(new PropertyValueFactory<>("LeftTime"));

        tblOnDriverShift.setItems(OnDriverShift_Vehical);


    }

    public static void setOnDriverShift_details(String number, String Vehicaltype, String Driver, String realTimeAndDate) {
        OndriverShift ODf=new OndriverShift(number,Vehicaltype,Driver,realTimeAndDate);
        OnDriverShift_Vehical.add(ODf);
    }

}
