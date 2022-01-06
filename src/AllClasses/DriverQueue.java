package AllClasses;

public class DriverQueue {
    static Driver[] driver_data;
    static int count;

    public DriverQueue() {
        driver_data = new Driver[16];
        count = 0;
    }
    public void enQueue(Driver d1) {
        driver_data[count++] = d1;
    }

    public static String findDriverNIC(String selectedDriver) {
        for (int i = 0; i < count; i++) {
            if (selectedDriver.equals(driver_data[i].getDriver_name())) {
                return driver_data[i].getNIC();
            }
        }
        return "Not Type";
    }
    public static Driver[] get_array(){
        return driver_data;
    }

    public void add_another_driver(Driver d2){
        Driver[] another_driver_data=new Driver[count+1];
        for (int i = 0; i < count; i++) {
            another_driver_data[i]=driver_data[i];
        }
        another_driver_data[count++] = d2;
        driver_data=another_driver_data;
    }

}
