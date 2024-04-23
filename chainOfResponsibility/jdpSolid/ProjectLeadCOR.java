package jdpSolid;

//A concrete handler
public class ProjectLeadCOR extends EmployeeCOR {
	
	public ProjectLeadCOR(LeaveApprover successor) {
		super("Project Lead", successor);
	}

	@Override
	protected boolean processRequest(LeaveApplication application) {

		//  type of leave is sick leave, duration <= 2 days
		if(application.getType() == LeaveApplication.Type.Sick) {
			if(application.getNoOfDays() <= 2) {
				application.approve(getApproverRole());
				return true;
			}
		}
		return false;
	}
}