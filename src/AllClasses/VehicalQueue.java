package AllClasses;

public class VehicalQueue {
    static Vehical[] vehical_data;
    static int count;

    public VehicalQueue() {
        vehical_data = new Vehical[14];
        count = 0;
    }

    public static void setDriverNIC(String selectedVehical, String findDriverNIC) {
        for (int i = 0; i < count; i++) {
            if (selectedVehical.equals(vehical_data[i].getVehical_number())) {
                 vehical_data[i].setNIC(findDriverNIC);
            }
        }

    }

    public void enQueue(Vehical v1) {
        vehical_data[count++] = v1;
    }

    public static String findVehicalType(String selectedVehical) {
        for (int i = 0; i < count; i++) {
            if (selectedVehical.equals(vehical_data[i].getVehical_number())) {
                return vehical_data[i].getVehical_type();
            }
        }
        return "Not Type";
    }
    public static Vehical[] get_array(){
        return vehical_data;
    }

    public void add_another_vehical(Vehical v2){
        Vehical[] another_vehical_data=new Vehical[count+1];
        for (int i = 0; i < count; i++) {
            another_vehical_data[i]=vehical_data[i];
        }
        another_vehical_data[count++] = v2;
        vehical_data=another_vehical_data;
    }
}


