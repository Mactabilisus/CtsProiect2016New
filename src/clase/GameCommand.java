package clase;

public class GameCommand {
	private String gameName = "Hearthstone";
	private int time = 5;
	
	public void pauza()
	{
		System.out.println("Jocul de " +gameName+" va lua o pauza de "+time+ " minute");
	}
	
	public void reluare()
	{
		System.out.println("Jocul de " +gameName+ " s-a reluat dupa "+time+" minute");
	}
}
