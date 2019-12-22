package sii.maroc.Factory;

import sii.maroc.Ticket;

public class FactoryTicket {
	public Ticket getTicketInstance(String dish,int number) {
		Ticket ticket=new Ticket();
		ticket.addTicket(dish,number);
		return ticket;
	}
	

}
