package jdpSolid;

import jdpSolid.Instance.Capacity;
import jdpSolid.aws.AwsResourceFactory;
import jdpSolid.gcp.GoogleResourceFactory;

public class ClientAFS {

	private ResourceFactory factory;
	
	public ClientAFS(ResourceFactory factory) {
		this.factory = factory;
	}
	
	public Instance createServer(Instance.Capacity cap, int storageMib) {
		Instance instance = factory.createInstance(cap);
		Storage storage = factory.createStorage(storageMib);
		instance.attachStorage(storage);
		return instance;
	}
    public static void main(String[] args) {
    	
    	ClientAFS aws = new ClientAFS(new AwsResourceFactory());
    	Instance i1 = aws.createServer(Capacity.micro, 20480);
    	i1.start();
    	i1.stop();
    	
    	System.out.println("*****************************************");
    	ClientAFS gcp = new ClientAFS(new GoogleResourceFactory());
    	Instance i2 = gcp.createServer(Capacity.micro, 40960);
    	i2.start();
    	i2.stop();	
    }
}