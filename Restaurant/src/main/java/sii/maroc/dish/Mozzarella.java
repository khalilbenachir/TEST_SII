package sii.maroc.dish;

import sii.maroc.Meal;
import sii.maroc.Ticket;
import sii.maroc.Factory.FactoryMeal;
import sii.maroc.Factory.FactoryTicket;
import sii.maroc.exception.UnavailableDishException;

public class Mozzarella {
	//"6 balls Mozzarella", "20 tomatoes", "olive oil", "pepper"
	private int numberOfMozzarella;
	private int numberOfTomatoes;
	private boolean oliveOil;
	private boolean pepper;
	private FactoryTicket factoryTicket=new FactoryTicket();
	private FactoryMeal factoryMeal=new FactoryMeal();
	
	public Mozzarella(int numberOfMozzarella, int numberOfTomatoes, boolean oliveOil, boolean pepper) {
		super();
		this.numberOfMozzarella = numberOfMozzarella;
		this.numberOfTomatoes = numberOfTomatoes;
		this.oliveOil = oliveOil;
		this.pepper = pepper;
	}
	
	public Ticket order(String Mozzarella) {
		int numberOfIngredient=Integer.parseInt(Mozzarella.substring(0, 1));
		String dish=Mozzarella.substring(2, 3);
		if(numberOfIngredient>this.numberOfMozzarella || (numberOfIngredient*2)>this.numberOfTomatoes)
			return null;
		
		else return factoryTicket.getTicketInstance(dish, numberOfIngredient);
		
		
		
	}
	
	public Meal retrieve(Ticket ticker) {
		
		if(ticker!=null) return factoryMeal.getMealInstance(ticker);
		return null;
	}

	
	

	
	

}
