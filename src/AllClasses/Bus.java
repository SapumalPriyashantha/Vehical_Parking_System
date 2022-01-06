package AllClasses;

public class Bus implements Vehical{
    String vehical_number;
    String vehical_type;
    String maximum_weigth;
    String num_of_passengers;
    String driver_NIC;

    //int[] reservedSlotBus =new int[1];
    public void park(String vehical_number,String vehical_type){};
    public void leave_park(String vehical_number,String vehical_type){};

    public String getVehical_number(){
        return vehical_number;
    }
    public String getVehical_type(){
        return  vehical_type;
    }
    public void setNIC(String findDriverNIC){
        this.driver_NIC=findDriverNIC;
    }

    public Bus(String vehical_number, String vehical_type, String maximum_weigth, String num_of_passengers) {
        this.vehical_number = vehical_number;
        this.vehical_type = vehical_type;
        this.maximum_weigth = maximum_weigth;
        this.num_of_passengers = num_of_passengers;
    }
}
