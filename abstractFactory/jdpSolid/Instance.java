package jdpSolid;

//Represents an abstract product for compute resources
public interface Instance {
    enum Capacity{micro, small, large}

    void start();

    void attachStorage(Storage storage);

    void stop();
}