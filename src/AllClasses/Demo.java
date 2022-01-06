package AllClasses;

public class Demo {
    static VehicalQueue VQ=new VehicalQueue();
    static DriverQueue  DQ=new DriverQueue();
    static ParkingSlotQueue PSQ=new ParkingSlotQueue();


    public static void firstMethod (String args[]){
        VQ.enQueue(new Van("KA-4563","Van","1000","7"));
        VQ.enQueue(new Van("58-3567","Van","1500","4"));
        VQ.enQueue(new Van("GF-4358","Van","800","4"));
        VQ.enQueue(new Van("CCB-3568","Van","1800","8"));
        VQ.enQueue(new Van("LM-6679","Van","1500","4"));
        VQ.enQueue(new Van("QA-3369","Van","1800","6"));
        VQ.enQueue(new CargoLorry("KB-3668","Cargo Lorry","2500","2"));
        VQ.enQueue(new CargoLorry("JJ-9878","Cargo Lorry","3000","2"));
        VQ.enQueue(new CargoLorry("GH-5772","Cargo Lorry","4000","3"));
        VQ.enQueue(new CargoLorry("XY-4456","Cargo Lorry","3500","2"));
        VQ.enQueue(new CargoLorry("YQ-3536","Cargo Lorry","2000","2"));
        VQ.enQueue(new CargoLorry("CBB-3566","Cargo Lorry","2500","2"));
        VQ.enQueue(new CargoLorry("QH-3444","Cargo Lorry","5000","4"));
        VQ.enQueue(new Bus("NA-3434","Bus","3500","60"));

        DQ.enQueue(new Driver("Sumith Kumara","7835348345V","B6474845","Panadura","0725637456"));
        DQ.enQueue(new Driver("Amila Pathirana","8826253734V","B3354674","Galle","0717573583"));
        DQ.enQueue(new Driver("Jithmal Perera","9283289272V","B3674589","Horana","0772452457"));
        DQ.enQueue(new Driver("Sumith Dissanayaka","9425245373V","B8366399","Kaluthara","0782686390"));
        DQ.enQueue(new Driver("Sumanasiri Herath","8976544373V","B3537538","Beruwala","0772534436"));
        DQ.enQueue(new Driver("Awantha Fernando","9173537839V","B3554789","Colombo 5","0714534356"));
        DQ.enQueue(new Driver("Charith Sudara","9573536833V","B6835836","Baththaramulla","0771536662"));
        DQ.enQueue(new Driver("Prashan Dineth","9362426738V","B2683536","Wadduwa","0715353434"));
        DQ.enQueue(new Driver("Chethiya Dilan","9162353436V","B6836836","Panadura","0772436737"));
        DQ.enQueue(new Driver("Dushantha Perera","9255556343V","B3334435","Matara","0777245343"));
        DQ.enQueue(new Driver("Sumith Udayanga","8735354355V","B3573783","Galle","0703635442"));
        DQ.enQueue(new Driver("Dinesh Udara","9026344373V"," B5343783","Hettimulla","0713456878"));
        DQ.enQueue(new Driver("Udana Chathuranga"," 9692653338V","Kottawa","","0772442444"));
        DQ.enQueue(new Driver("Mohommad Riaz","9124537733V","B3638537","Kaluthara","0777544222"));
        DQ.enQueue(new Driver("Sandun Kumara","9563524267V","B2263333","Panadura","0772325544"));
        DQ.enQueue(new Driver("Priyanga Perera","9135343537V","B3853753","Matara","0723344562"));

        PSQ.enQueue(new ParkingSlot("01","Van"));
        PSQ.enQueue(new ParkingSlot("02","Van"));
        PSQ.enQueue(new ParkingSlot("03","Van"));
        PSQ.enQueue(new ParkingSlot("04","Van"));
        PSQ.enQueue(new ParkingSlot("05","Cargo Lorry"));
        PSQ.enQueue(new ParkingSlot("06","Cargo Lorry"));
        PSQ.enQueue(new ParkingSlot("07","Cargo Lorry"));
        PSQ.enQueue(new ParkingSlot("08","Cargo Lorry"));
        PSQ.enQueue(new ParkingSlot("09","Cargo Lorry"));
        PSQ.enQueue(new ParkingSlot("10","Cargo Lorry"));
        PSQ.enQueue(new ParkingSlot("11","Cargo Lorry"));
        PSQ.enQueue(new ParkingSlot("12","Van"));
        PSQ.enQueue(new ParkingSlot("13","Van"));
        PSQ.enQueue(new ParkingSlot("14","Bus"));


    }

    public static VehicalQueue get_Vehicalreference(){
        return VQ;
    }
    public static DriverQueue get_Driverreference(){
        return DQ;
    }
}
