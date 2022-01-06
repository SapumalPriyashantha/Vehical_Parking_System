package AllClasses;

public class ParkingSlot {
    String slot_number;
    String vehical_type;
    String vehical_number;

    public ParkingSlot(String slot_number, String vehical_type) {
        this.slot_number = slot_number;
        this.vehical_type = vehical_type;
    }
    public String getParking_Slot_Type(){
        return  vehical_type;
    }
    public String getParking_Slot_Numbere(){
        return  slot_number;
    }
    public void setParking_Slot_Type(String change_parking_slot_type){
        this.vehical_type=change_parking_slot_type;
    }
    public String getParking_vehical_number(){
        return vehical_number;
    }
    public void changParking_vehical_number(String change_parking_vehical_number){
        this.vehical_number=change_parking_vehical_number;
    }
}
