package AllClasses;

public interface Vehical {
    public String getVehical_number();
    public String getVehical_type();

    public void park (String vehical_number,String vehical_type);
    public void leave_park (String vehical_number,String vehical_type);

    public void setNIC(String findDriverNIC);
}
