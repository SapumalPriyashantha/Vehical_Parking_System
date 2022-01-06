package AllClasses;

public class Driver {
    String driver_name;
    String NIC;
    String Driver_license_number;
    String address;
    String contact_num;


    public Driver(String driver_name, String NIC, String driver_license_number, String address, String contact_num) {
        this.driver_name = driver_name;
        this.NIC = NIC;
        this.Driver_license_number = driver_license_number;
        this.address = address;
        this.contact_num = contact_num;
    }
    public String getDriver_name(){
        return driver_name;
    }
    public String getNIC(){
        return NIC;
    }
}
