package clase;

public class SingletonGame {
	static SingletonGame instanta = new SingletonGame();
	
	private SingletonGame(){	}
	
	public static SingletonGame getInstance()
	{
		return instanta;
	}
	
	public void showMessage()
	{
		System.out.println("Hearthstone has started. \nI've been waiting for ya \nOnly one instance of the game can be run at a time");
	}
}
