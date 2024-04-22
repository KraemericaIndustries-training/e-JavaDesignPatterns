package jdpSolid;

public class New implements OrderState {

	@Override
	public double handleCancellation() {
		System.out.println("A new order.  No Processing.");
		return 0;
	}	
}