package jdpSolid;

public class NullStorageService extends StorageService {

	@Override
	public void save(ReportNull report) {
		System.out.println("Null object save method.  Do nothing.");
	}
}