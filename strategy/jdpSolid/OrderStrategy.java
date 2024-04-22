package jdpSolid;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class OrderStrategy {

	private Map<String, Double> items = new HashMap<>();
	
	private String id;
    private LocalDate date;
    private double total;

    public OrderStrategy(String id) {
        this.id = id;
        date = LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public Map<String, Double> getItems() {
        return items;
    }

    public void addItem(String name, double price) {
        items.put(name, price);
        total+= price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}