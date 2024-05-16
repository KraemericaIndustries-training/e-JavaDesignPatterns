package jdpSolidEager;

public class ClientSingleton {

	public static void main(String[] args) {
		
//		EagerRegistry registry = new EagerRegistry();  <-  Won't work.  The constructor is PRIVATE
		EagerRegistry registry = EagerRegistry.getInstance();
		EagerRegistry registry2 = EagerRegistry.getInstance();
		System.out.println(registry == registry2);
		
		LazyRegistryWithDCL lazysingleton1 = LazyRegistryWithDCL.getInstance();
		LazyRegistryWithDCL lazysingleton2 = LazyRegistryWithDCL.getInstance();		
		System.out.println(lazysingleton1 == lazysingleton2);
		
		LazyRegistryIODH singleton;
		singleton = LazyRegistryIODH.getInstance();
		singleton = LazyRegistryIODH.getInstance();
		singleton = LazyRegistryIODH.getInstance();
	}
}