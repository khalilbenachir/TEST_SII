package sii.maroc;

import java.util.HashMap;

public class Ticket {
	
	private HashMap<String, Integer> commandes;
	
	public Ticket() {
		// TODO Auto-generated constructor stub
		this.commandes=new HashMap<String, Integer>();
	}
	
	public void addTicket(String dish,int number) {
		commandes.put(dish,number);
	}

	public Ticket and(String command) {
		// TODO Auto-generated method stub
		
		int number=Integer.parseInt(command.substring(0, 1));
		String dish=command.substring(1, 3);
		this.addTicket(dish, number);
		return this;
	}
	
	public HashMap<String, Integer> getCommandes() {
		return commandes;
	}

}
