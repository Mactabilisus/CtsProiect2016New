package clase;

public class TurnBased extends Observer{

	private MomentInJoc moment;

	public TurnBased(MomentInJoc moment)
	{
		this.moment = moment;
		this.moment.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Turn "+ Integer.toString(moment.getMoment()) + " has started you now have "+Integer.toString(moment.getMoment())+" mana crystal");
		
	}

}
