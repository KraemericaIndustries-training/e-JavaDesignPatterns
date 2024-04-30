package jdpSolid.gcp;

import jdpSolid.Instance;
import jdpSolid.Instance.Capacity;
import jdpSolid.ResourceFactory;
import jdpSolid.Storage;


//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}
}