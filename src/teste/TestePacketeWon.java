package teste;

import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.easymock.Mock;
import org.easymock.MockType;
import org.easymock.tests.MockingTest;
import org.junit.Test;

import clase.PurchasedPacks;
import junit.framework.TestCase;

public class TestePacketeWon extends TestCase{
	
	PurchasedPacks packeteCumparate = new PurchasedPacks("pachet1", 4, 5, 1, 0);
	PurchasedPacks pack ;
	
	public TestePacketeWon(String name) {
		super(name);
	}

	//valoare mai mica decat parametrul indicat la numar carti din pachet (3)
	@Test
	public void testNrCartiMaiMic() {
		int nrCarti=4;
		try{
			packeteCumparate.setCartiInPacket(nrCarti);
			fail("Acepta nr carti = 5 ");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	
	//right
	
	@Test
	public void testRightNume()
	{
		assertEquals("pachet1", packeteCumparate.getNume());
	}
	
	
	//setare nume nou
	@Test
	public void testFail()
	{
		try
		{
			PurchasedPacks pachet2 = new PurchasedPacks("pachet2", 4, 5, 1, 100);
			pachet2.setNume("pachet3");
			assertEquals("pachet3", pachet2.getNume());
			
		}
		catch(Exception ex)
		{
			
		}
	}
	
	//null
	@Test
	public void testNumeNull()
	{
		String nume = null;
		try
		{
			pack = new PurchasedPacks(nume, 3, 5, 0, 100);
			fail("Lipsa exceptie pe nume = null");
		}
		catch(Exception ex)
		{
			//ex.printStackTrace();
		}
	}
}
