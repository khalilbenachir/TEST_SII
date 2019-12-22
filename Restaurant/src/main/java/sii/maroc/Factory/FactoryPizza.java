package sii.maroc.Factory;

import sii.maroc.dish.Mozzarella;
import sii.maroc.dish.Pizza;

public class FactoryPizza {
	
	public  Pizza getMozzarellaInstance(String ...ingredients) {
		
		int numberOfMozzarella=Integer.parseInt(ingredients[3].substring(0, 1));
		 int numberOfTomatoes=Integer.parseInt(ingredients[1].substring(0, 2));

		 int numberOfFlour=Integer.parseInt(ingredients[0].substring(0, 3).replace("Kg", ""));

		 return new Pizza(numberOfFlour, numberOfTomatoes, true, numberOfMozzarella, true, true);
	}
	
	

}
