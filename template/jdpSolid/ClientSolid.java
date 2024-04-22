package jdpSolid;

import java.io.IOException;

public class ClientSolid {

	public static void main(String[] args) throws IOException {

		OrderStrategy order = new OrderStrategy("1001");
		order.addItem("Soda", 2.50);
		order.addItem("Sandwhich", 11.95); 
    	order.addItem("Pizza", 15.95);
    	
    	OrderPrinter printer = new TextPrinter();
    	printer.printOrder(order, "1001.txt");
		
    	
    	printer = new HtmlPrinter();
    	printer.printOrder(order, "1001.html");
	}
}