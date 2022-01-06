package AllClasses;

public class Van implements Vehical{
   private String vehical_number;
   private String vehical_type;
   private String maximum_weigth;
   private String num_of_passengers;
   private String driver_NIC;


    int[] reservedSlotVan =new int[6];
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

    public Van(String vehical_number, String vehical_type, String  maximum_weigth, String num_of_passengers) {
        this.vehical_number = vehical_number;
        this.vehical_type = vehical_type;
        this.maximum_weigth = maximum_weigth;
        this.num_of_passengers = num_of_passengers;
    }
}
