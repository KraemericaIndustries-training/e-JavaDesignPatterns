package jdpSolid;

import jdpSolid.email.EmailFacade;

public class ClientFacadeSolid {

	public static void main(String[] args) {
		OrderFacade order = new OrderFacade("101", 99.99);
		EmailFacade facade = new EmailFacade();
		
		boolean result = facade.sendOrderEmail(order);
		
		System.out.println("Order Email "+ (result?"sent!":"NOT sent..."));	
	}	
}