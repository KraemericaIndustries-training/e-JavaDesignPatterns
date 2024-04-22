package jdpSolid;

public class ClientNull {

	public static void main(String[] args) {
		ComplexService service = new ComplexService("Simple report", new StorageService());
		service.generateReport();
		
		service = new ComplexService("Simple report2", new NullStorageService());
		service.generateReport();
	}

}