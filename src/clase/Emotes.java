package clase;

import java.util.Date;

public class Emotes {
	public static void showEmote(User user, String message)
	{
		System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
	}
}
