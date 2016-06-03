package clase;

import interfete.IOrder;

public class PauzaCommand implements IOrder{
	private GameCommand hs;
	
	public PauzaCommand(GameCommand hs) {
		this.hs = hs;
	}
	@Override
	public void executeCommand() {
		hs.pauza();	
	}

}
