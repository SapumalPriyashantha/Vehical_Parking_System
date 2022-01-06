package AllClasses;

public class OndriverShift {
    String Vehical_number;
    String Vehical_type;
    String Driver_name;
    String LeftTime;

    public OndriverShift(String vehical_number, String vehical_type, String driver_name, String leftTime) {
        Vehical_number = vehical_number;
        Vehical_type = vehical_type;
        Driver_name = driver_name;
        LeftTime = leftTime;
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

    public String getDriver_name() {
        return Driver_name;
    }

    public void setDriver_name(String driver_name) {
        Driver_name = driver_name;
    }

    public String getLeftTime() {
        return LeftTime;
    }

    public void setLeftTime(String leftTime) {
        LeftTime = leftTime;
    }
}
