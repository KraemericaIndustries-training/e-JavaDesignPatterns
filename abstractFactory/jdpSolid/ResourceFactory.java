package jdpSolid;

import jdpSolid.Instance.Capacity;

//Abstract factory with methods defined for each object type.
public interface ResourceFactory {

	Instance createInstance(Capacity capacity);
	
	Storage createStorage(int capMib);
}