package jdpSolid;
//A concrete handler

public class ManagerCOR extends EmployeeCOR {

	public ManagerCOR(LeaveApprover nextApprover) {
		super("Manager", nextApprover);
	}
	
	@Override
	protected boolean processRequest(LeaveApplication application) {
		switch (application.getType()) {
		case Sick:
			application.approve(getApproverRole());
			return true;
		case PTO:
			if(application.getNoOfDays() <= 5) {
				application.approve(getApproverRole());
				return true;
			}
		}
		return false;
	}	
}