package jdpSolid;

public class ClientStateSolid {

    public static void main(String[] args) {
        
    	Order order = new Order();
    	
    	order.dispatched();
    	order.cancel();
    }
}