package tjdpc;

import java.util.LinkedList;

public class Product {

    private LinkedList<String> parts;

    public Product() {
        parts = new LinkedList<String>();
    }

    public void add(String part) {
        parts.addLast(part);
    }

    public void show() {
        System.out.println("Product completed as follows:");

        for(String part: parts) {
            System.out.println(part);
        }
    }
}