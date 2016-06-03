package clase;

import interfete.IOrder;

public class ReluareCommand implements IOrder{
	public GameCommand hs;
	
	public ReluareCommand(GameCommand hs) {
		this.hs = hs;
	}
	@Override
	public void executeCommand() {
		hs.reluare();
		
	}

}
