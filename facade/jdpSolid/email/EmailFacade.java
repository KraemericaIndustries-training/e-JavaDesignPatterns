package jdpSolid.email;

import jdpSolid.email.Template.TemplateType;
import jdpSolid.OrderFacade;

//Facade provides simple methods for client to use
public class EmailFacade {
	
	public boolean sendOrderEmail(OrderFacade order) {
		Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
		Stationary stationary = StationaryFactory.createStationary();
		Email email = Email.getBuilder()
					  .withTemplate(template)
					  .withStationary(stationary)
					  .forObject(order)
					  .build();
		Mailer mailer = Mailer.getMailer();
		return mailer.send(email);
	}
}