package sii.maroc.Factory;

import sii.maroc.dish.Mozzarella;

public class FactoryMozzarella {
	public Mozzarella getMozzarellaInstance(String ...ingredients) {
		int numberOfMozzarella=Integer.parseInt(ingredients[0].substring(0, 1));
		 int numberOfTomatoes=Integer.parseInt(ingredients[1].substring(0, 2));
		 
		 return new Mozzarella(numberOfMozzarella, numberOfTomatoes, true, true);
	}
	
	

}
