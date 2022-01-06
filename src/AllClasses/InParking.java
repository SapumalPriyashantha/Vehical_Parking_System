package AllClasses;

public class InParking {
    String Vehical_number;
    String Vehical_type;
    String Parking_slot;
    String Paking_time;

    public InParking(String Vehical_number, String Vehical_type,String Parking_slot,String Paking_time ) {
        this.Vehical_number = Vehical_number;
        this.Vehical_type = Vehical_type;
        this.Parking_slot =Parking_slot;
        this.Paking_time =Paking_time;
    }

    public String getVehical_number() {
        return Vehical_number;
    }

    public void setVehical_number(String vehical_number) {
        Vehical_number = vehical_number;
    }

    public String getVehical_type() {
        return Vehical_type;
    }

    public void setVehical_type(String vehical_type) {
        Vehical_type = vehical_type;
    }

    public String getParking_slot() {
        return Parking_slot;
    }

    public void setParking_slot(String parking_slot) {
        Parking_slot = parking_slot;
    }

    public String getPaking_time() {
        return Paking_time;
    }

    public void setPaking_time(String paking_time) {
        Paking_time = paking_time;
    }

    @Override
    public String toString() {
        return "InParking{" +
                "Vehical_number='" + Vehical_number + '\'' +
                ", Vehical_type='" + Vehical_type + '\'' +
                ", Parking_slot='" + Parking_slot + '\'' +
                ", Paking_time='" + Paking_time + '\'' +
                '}';
    }
}
