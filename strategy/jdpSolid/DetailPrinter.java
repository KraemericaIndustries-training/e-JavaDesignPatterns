package jdpSolid;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class DetailPrinter implements OrderPrinterStrategy {

    @Override
    public void printMethod(Collection<OrderStrategy> orders) {

    	System.out.println("************* Detail Report ***********");
        
    	Iterator<OrderStrategy> iter = orders.iterator();
        
    	double total = 0;
        
    	for(int i=1;iter.hasNext();i++) {
            double orderTotal = 0;
            OrderStrategy order = iter.next();
            System.out.println(i + ". " + order.getId() + " \t" + order.getDate());
            for(Map.Entry<String, Double> entry : order.getItems().entrySet()) {
                System.out.println("\t\t" + entry.getKey() + "\t"+entry.getValue());
                orderTotal += entry.getValue();
            }
            System.out.println("----------------------------------------");
            System.out.println("\t\t Total  "+orderTotal);
            System.out.println("----------------------------------------");
            total += orderTotal;
        }
        System.out.println("----------------------------------------");
        System.out.println("\tGrand Total " + total);
    }
}