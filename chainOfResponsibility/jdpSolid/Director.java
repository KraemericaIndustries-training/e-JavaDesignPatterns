package jdpSolid;

import jdpSolid.LeaveApplication.Type;

//import com.coffeepoweredcrew.chainofresponsibility.LeaveApplication.Type;
//A concrete handler
public class Director extends EmployeeCOR {

	public Director(LeaveApprover nextApprover) {
		super("Director", nextApprover);
	}
	
	@Override
	protected boolean processRequest(LeaveApplication application) {
		if(application.getType() == Type.PTO) {
			application.approve(getApproverRole());
			return true;
		}
		return false;
	}	
}