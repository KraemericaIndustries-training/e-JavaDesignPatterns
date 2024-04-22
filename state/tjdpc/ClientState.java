package tjdpc;

public class ClientState {
    public static void main(String[] args) {
        System.out.println("***State Pattern Demo***\n");

        Off initialState = new Off();  //Initially TV is Off

        TV tv = new TV(initialState);

        tv.pressButton();  //First time press
        tv.pressButton();  //Second time press
    }
}