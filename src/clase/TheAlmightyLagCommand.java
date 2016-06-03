package clase;


import java.util.ArrayList;
import java.util.List;

import interfete.IOrder;

public class TheAlmightyLagCommand {
	private List<IOrder> Listaorders = new ArrayList<IOrder>();
	
	public void daComanda(IOrder order)
	{
		Listaorders.add(order);
	}
	
	public void executaOrders()
	{
		for(IOrder order : Listaorders)
		{
			order.executeCommand();
		}
		Listaorders.clear();
	}
	
}
