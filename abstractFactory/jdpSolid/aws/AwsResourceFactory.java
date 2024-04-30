package jdpSolid.aws;

import jdpSolid.Instance;
import jdpSolid.Instance.Capacity;
import jdpSolid.ResourceFactory;
import jdpSolid.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}
}