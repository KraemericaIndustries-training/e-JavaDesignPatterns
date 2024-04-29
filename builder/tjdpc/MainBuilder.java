package tjdpc;

public class MainBuilder {
    public static void main(String[] args) {

        System.out.println("***Builder Pattern Demo***");

        Director director = new Director();

        BuilderInterface carBuilder = new CarB();
        BuilderInterface motorBuilder = new Motorcycle();

        director.construct(carBuilder);
        director.construct(motorBuilder);

        Product p1 = carBuilder.getVehicle();
        p1.show();

        Product p2 = motorBuilder.getVehicle();
        p2.show();
    }
}