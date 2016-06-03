package clase;


import java.util.ArrayList;
import java.util.List;

public class MomentInJoc {
	private List<Observer> manaCrystal = new ArrayList<Observer>();
	private int moment;
	
	public int getMoment() {
		return moment;
	}
	public void setMoment(int moment) {
		this.moment = moment; 
		notificare();
	}
	
	public void attach(Observer observer)
	{
		manaCrystal.add(observer);
	}
	public void notificare() {
		for(Observer observer : manaCrystal)
		{
			observer.update();
		}
	}	
}
