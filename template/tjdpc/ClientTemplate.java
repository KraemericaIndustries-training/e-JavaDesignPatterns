package tjdpc;

public class ClientTemplate {
    public static void main(String[] args) {

        HouseTemplate houseType = new WoodenHouse();

        houseType.buildHouse();  // using template method

        System.out.println("************");

        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}