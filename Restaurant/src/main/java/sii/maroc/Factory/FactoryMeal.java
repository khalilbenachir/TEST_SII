package sii.maroc.Factory;

import sii.maroc.Meal;
import sii.maroc.Ticket;

public class FactoryMeal {
	public  Meal getMealInstance(Ticket ticket) {
		return new Meal(ticket);
	}
	
	

}
