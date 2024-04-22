package jdpSolid;

import java.util.Collection;

//Strategy
public interface OrderPrinterStrategy {

	void printMethod(Collection<OrderStrategy> orders);
}