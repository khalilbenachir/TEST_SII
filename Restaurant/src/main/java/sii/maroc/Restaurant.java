package sii.maroc;

import sii.maroc.Factory.FactoryMeal;
import sii.maroc.Factory.FactoryMozzarella;
import sii.maroc.Factory.FactoryPizza;
import sii.maroc.Factory.FactoryTicket;
import sii.maroc.dish.Mozzarella;
import sii.maroc.dish.Pizza;
import sii.maroc.exception.UnavailableDishException;

public class Restaurant {
	private Mozzarella mozzarella;
	private Pizza pizza;
	private FactoryMeal factoryMeal=new FactoryMeal();
	private FactoryTicket factoryTicket=new FactoryTicket();
	private FactoryMozzarella factoryMozzarella=new FactoryMozzarella();
	private FactoryPizza factoryPizza=new FactoryPizza();

	public Restaurant(String ...ingredients) {
		// TODO Auto-generated constructor stub
		
		if(ingredients.length==4)
			mozzarella=factoryMozzarella.getMozzarellaInstance(ingredients);
		else pizza=factoryPizza.getMozzarellaInstance(ingredients);
	}



	public Ticket order(String dish) {
		// TODO Auto-generated method stub
		if(mozzarella!=null) return mozzarella.order(dish);
		else if(pizza !=null) return pizza.order(dish);
		else return null;
	}

	public Meal retrieve(Ticket ticket) {
		// TODO Auto-generated method stub
		if(mozzarella!=null) return mozzarella.retrieve(ticket);
		else if(pizza !=null) return pizza.retrieve(ticket);
		return null;
	}


	
}
