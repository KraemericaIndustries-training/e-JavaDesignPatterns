package jdpSolid;

import java.time.LocalDate;

import jdpSolid.LeaveApplication.Type;

public class ClientCORsolid {

	public static void main(String[] args) {
	   LeaveApplication application = LeaveApplication.getBuilder().withType(Type.Sick)
			   .from(LocalDate.now()).to(LocalDate.of(2024, 4, 25))
			   .build();
	   System.out.println(application);
	   System.out.println("********************************************");
	   LeaveApprover approver = createChain();
	   approver.processLeaveApplication(application);
	   System.out.println(application);
	}

	private static LeaveApprover createChain() {
		Director director = new Director(null);
		ManagerCOR manager = new ManagerCOR(director);
		ProjectLeadCOR lead = new ProjectLeadCOR(manager);
		return lead;
	}
}