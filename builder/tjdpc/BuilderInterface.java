package tjdpc;

interface BuilderInterface {
    void buildBody();
    void insertWheels();
    void addHeadLights();
    Product getVehicle();
}

class CarB implements BuilderInterface {
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is the body of the car");
    }
    @Override
    public void insertWheels() {
        product.add("4 wheels are added");
    }
    @Override
    public void addHeadLights() {
        product.add("2 HeadLights are added");
    }
    @Override
    public Product getVehicle() {
        return product;
    }
}

class Motorcycle implements BuilderInterface {

    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is the body of a Motorcycle");
    }
    @Override
    public void insertWheels() {
        product.add("2 wheels are added");
    }
    @Override
    public void addHeadLights() {
        product.add("1 HeadLights are added");
    }
    @Override
    public Product getVehicle() {
        return product;
    }
}