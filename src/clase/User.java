package clase;

public class User {
	private String nume;
	
	public String getName() {
		// TODO Auto-generated method stub
		return nume;
	}
	
	public void setName(String name)
	{
		this.nume = nume;
	}
	
	public User(String nume)
	{
		this.nume = nume;
	}
	
	public void sendMessage(String message)
	{
		Emotes.showEmote(this, message);
	}
}
