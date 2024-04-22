package jdpSolid;

import java.util.Map;

//Concrete implementation. Implements steps needed by template method
public class TextPrinter extends OrderPrinter {

	@Override
	protected String start() {
		return "Order Deatils";
	}

	@Override
	protected String formatOrderNumber(OrderStrategy order) {
		return "Order #" + order.getId();
	}

	@Override
	protected String formatItems(OrderStrategy order) {
		
		StringBuilder builder = new StringBuilder("Items\n----------------------------------------\n");
		
		for(Map.Entry<String, Double> entry : order.getItems().entrySet()) {
			builder.append(entry.getKey() + " $" + entry.getValue() + "\n");
		}
		builder.append("----------------------------------------");
		return builder.toString();
	}

	@Override
	protected String formatTotal(OrderStrategy order) {
		return "Total: $" + order.getTotal();
	}

	@Override
	protected String end() {
		return "";
	}
}