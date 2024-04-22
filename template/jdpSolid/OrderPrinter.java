package jdpSolid;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

//Abstract base class defines the template method
public abstract class OrderPrinter {

	public final void printOrder(OrderStrategy order, String filename) throws FileNotFoundException {
		
		try(PrintWriter writer = new PrintWriter(filename)) {
			writer.println(start());
			writer.println(formatOrderNumber(order));
			writer.println(formatItems(order));
			writer.println(formatTotal(order));
			writer.println(end());
		}
	}
	
	protected abstract String start();
	protected abstract String formatOrderNumber(OrderStrategy order);
	protected abstract String formatItems(OrderStrategy order);
	protected abstract String formatTotal(OrderStrategy order);
	protected abstract String end();
}