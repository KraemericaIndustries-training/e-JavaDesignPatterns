package tjdpc;

public class ClientBridge {
    public static void main(String[] args){

        //  To construct a car requires 2 workshops (for the SUPER constructor of Vehicle)
        //  Produce and Assemble are INSTANCES of WORKSHOPS
        Vehicle vehicle1 = new Car(new Produce(), new Assemble());
        vehicle1.manufacture();

        Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
        vehicle2.manufacture();
    }
}