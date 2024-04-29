package tjdpc;

public class Director {

    BuilderInterface mybuilder;

    public void construct(BuilderInterface builder) {
        mybuilder = builder;
        mybuilder.buildBody();
        mybuilder.insertWheels();
        mybuilder.addHeadLights();
    }
}