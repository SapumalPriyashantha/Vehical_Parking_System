package AllClasses;

public class ParkingSlotQueue {
    static ParkingSlot[] parking_data;
    static int count;

    public ParkingSlotQueue() {
        parking_data = new ParkingSlot[14];
        count = 0;
    }

    public void enQueue(ParkingSlot ps) {
        parking_data[count++] = ps;
    }

    public static String findVehicalSlot(String findVehicaltype,String selectedVehical) {
        for (int i = 0; i < count; i++) {
            if (findVehicaltype.equals(parking_data[i].getParking_Slot_Type())) {
                parking_data[i].changParking_vehical_number(selectedVehical);
                parking_data[i].setParking_Slot_Type("Available");
                return parking_data[i].getParking_Slot_Numbere();
            }else if(selectedVehical.equals(parking_data[i].getParking_vehical_number())){
                parking_data[i].changParking_vehical_number(null);
                parking_data[i].setParking_Slot_Type(findVehicaltype);
                return "x";
            }

        }
        return "Un Available Parking Slot";
    }
   /* public static void findVehicalStatus(String selectedVehical, String findVehicaltype) {
        for (int i = 0; i < count; i++) {
            if (selectedVehical.equals(parking_data[i].getParking_vehical_number())) {
                parking_data[i].changParking_vehical_number(null);

            }
        }
    }*/



}
