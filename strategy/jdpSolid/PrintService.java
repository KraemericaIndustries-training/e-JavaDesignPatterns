package jdpSolid;


import java.util.LinkedList;

//Context 
public class PrintService {

    private OrderPrinterStrategy printer;
	
	public PrintService(OrderPrinterStrategy printer) {
		this.printer = printer;
    }

    public void printOrders(LinkedList<OrderStrategy> orders) {
        printer.printMethod(orders);
    }
}