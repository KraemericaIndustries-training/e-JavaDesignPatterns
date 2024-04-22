package jdpSolid;

import java.io.IOException;
import java.io.PrintWriter;

public class StorageService {

	public void save(ReportNull report) {
		System.out.println("Writing report out");
		try(PrintWriter writer = new PrintWriter(report.getName() + ".txt")) {
			
			writer.println(report.getName());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}