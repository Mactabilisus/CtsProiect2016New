package clase;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private List<Memento> lista = new ArrayList();
	
	public void add(Memento state)
	{
		lista.add(state);
	}
	
	public Memento get(int index)
	{
		return lista.get(index);
	}
}
