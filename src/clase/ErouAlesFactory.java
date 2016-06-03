package clase;



import java.util.HashMap;
import java.util.Map;

import interfete.IAlegeErou;

public class ErouAlesFactory {
	private static final Map<String, IAlegeErou> eroiMap = new HashMap<String, IAlegeErou>();
	
	public static IAlegeErou getNume(String nume)
	{
		EroulAlesInMeci eroul = (EroulAlesInMeci)eroiMap.get(nume);
		
		if(eroul == null)
		{
			eroul = new EroulAlesInMeci(nume);
			eroiMap.put(nume, eroul);
			System.out.println("Alegearea eroului : " + nume);
		}
		
		return eroul;
		
	}
}
