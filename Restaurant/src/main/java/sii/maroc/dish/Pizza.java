package sii.maroc.dish;

import sii.maroc.Meal;
import sii.maroc.Ticket;
import sii.maroc.Factory.FactoryMeal;
import sii.maroc.Factory.FactoryTicket;
import sii.maroc.exception.UnavailableDishException;

public class Pizza {

	/**
	 * recipe for a Pizza is
	 *
	 * 1 ball of Mozzarella 4 tomatoes some olive oil 100cl of water 300g of Flour
	 * sea salt
	 *
	 * cooking time is 10 minutes baking time is 10 minutes at 300 degree celsius
	 *
	 *
	 * Regarding baking : oven have unlimited capacity multiple dishes can be baked
	 * at the same time
	 */

	private int numberOfMozzarella;
	private int numberOfTomatoes;
	private boolean oliveOil;
	private boolean water;
	private boolean seaSalt;
	private int numberOfFlour;

	private FactoryTicket factoryTicket=new FactoryTicket();
	private FactoryMeal factoryMeal=new FactoryMeal();

	public Pizza(int numberOfFlour, int numberOfTomatoes, boolean seaSalt, int numberOfMozzarella, boolean oliveOil,
			boolean water) {
		// TODO Auto-generated constructor stub
		this.numberOfFlour = numberOfFlour;
		this.numberOfMozzarella = numberOfMozzarella;
		this.seaSalt = seaSalt;
		this.numberOfTomatoes = numberOfTomatoes;
		this.water = water;
		this.oliveOil = oliveOil;
	}

	public Ticket order(String Mozzarella){
		int numberOfIngredient = Integer.parseInt(Mozzarella.substring(0, 1));
		String dish = Mozzarella.substring(2, 3);
		if (numberOfIngredient > this.numberOfMozzarella || (numberOfIngredient * 2) > this.numberOfTomatoes)
			return null;

		else
			return factoryTicket.getTicketInstance(dish, numberOfIngredient);

	}

	public Meal retrieve(Ticket ticker) {
		if (ticker != null)
			return factoryMeal.getMealInstance(ticker);
		return null;
	}

}
