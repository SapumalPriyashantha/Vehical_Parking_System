package controller;

import AllClasses.*;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class AddVehicalFormController {
    public TextField txtMaximumWeight;
    public TextField txtNoOfPassengers;
    public TextField txtVehivalNumber;
    public ComboBox<String> cmbtVehicalType;



    public void AddVehical(ActionEvent actionEvent) {
       VehicalQueue VQ= Demo.get_Vehicalreference();
       String number= txtVehivalNumber.getText();
       String weigth= txtMaximumWeight.getText();
       String passengers= txtNoOfPassengers.getText();
       String type = cmbtVehicalType.getSelectionModel().getSelectedItem();
      //  System.out.println(text+"  "+weigth+"   "+passengers+"  "+type);
        if(type.equals("Van")) {
            VQ.add_another_vehical(new Van(number, type, weigth, passengers));
        }else if(type.equals("Bus")){
            VQ.add_another_vehical(new Bus(number, type, weigth, passengers));
        }else {
            VQ.add_another_vehical(new CargoLorry(number, type, weigth, passengers));
        }
    }

    public void initialize() {
        cmbtVehicalType.getItems().addAll(
                "Van",
                "Bus",
                "Cargo Lorry"

        );
    }
}
