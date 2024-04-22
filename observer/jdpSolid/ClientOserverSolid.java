package jdpSolid;

public class ClientOserverSolid {

    public static void main(String[] args) {

    	ObserverSolidOrder order = new ObserverSolidOrder("100");
    	
    	PriceObserver price = new PriceObserver();
    	
    	order.attach(price);
    	
    	order.addItem(50);
    	order.addItem(179);
    	System.out.println(order);
    }
}