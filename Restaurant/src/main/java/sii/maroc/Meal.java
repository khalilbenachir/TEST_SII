package sii.maroc;

public class Meal {
	private Ticket ticket;
	
	public Meal(Ticket ticker) {
		// TODO Auto-generated constructor stub
		this.ticket=ticker;
	}

	public int servedDishes() {
		// TODO Auto-generated method stub
		int numberOfServedDished=0;
		for (String dish  : ticket.getCommandes().keySet()) {
			numberOfServedDished+=ticket.getCommandes().get(dish);
		}
		
		return numberOfServedDished;
	}

	public int cookingDuration() {
		// TODO Auto-generated method stub
		int duration=0;
		for (String dish  : ticket.getCommandes().keySet()) {
			if(dish.equals("P")) {
				duration+=(ticket.getCommandes().get(dish)-1)*5;
				duration+=10;
			}
			else if(dish.equals("T")) {
				duration+=(ticket.getCommandes().get(dish)-1)*3;
				duration+=6;
			}
			
		}
		return duration;
	}

}
