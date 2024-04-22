package jdpSolid;

import java.util.LinkedList;

public class ClientStrategySolid {

    private static LinkedList<OrderStrategy> orders = new LinkedList<>();

    public static void main(String[] args) {
        
    	createOrders();  //  Generate test data

        //  print all orders with SummaryPrinter
        PrintService service = new PrintService(new SummaryPrinter());
        service.printOrders(orders);

        System.out.println("\n#################################################################################\n");
        
        //  print all orders with DetailPrinter
        service = new PrintService(new DetailPrinter());
        service.printOrders(orders);
    }

    private static void createOrders() {
        OrderStrategy o = new OrderStrategy("100");
        o.addItem("Soda", 2);
        o.addItem("Chips", 10);
        orders.add(o);

        o = new OrderStrategy("200");
        o.addItem("Cake", 20);
        o.addItem("Cookies", 5);
        orders.add(o);

        o = new OrderStrategy("300");
        o.addItem("Burger", 8);
        o.addItem("Fries", 5);
        orders.add(o);
    }
}