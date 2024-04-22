package jdpSolid;

//Concrete observer
public class PriceObserver implements OrderObserver {

	@Override
	public void updated(ObserverSolidOrder order) {
		
		double total = order.getItemCost();  //  callback to subject to get it's state		
		
		if(total >= 500) {
			order.setDiscount(20);
		}
		
		if(total >= 200) {
			order.setDiscount(10);
		}
	}	
}