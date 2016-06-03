package teste;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import clase.PurchasedPacks;
import junit.framework.TestCase;

public class TesteFisier {
	
	//extends TestCase
	public static File file;
	public static BufferedReader reader;
	
//	public TesteFisier(String name) {
//		super(name);
//	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
		file = new File("Pachete.txt");
		reader = new BufferedReader(new FileReader(file));
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class");
		reader.close();
	}
	
	@Test
	public void testNumeFis() {
		PurchasedPacks pachete = new PurchasedPacks();
		
		try{
			String linie = reader.readLine();
			while(linie != null){
				String[] results = linie.split(";");
				String q =results[0];
				int w = Integer.parseInt(linie.split(";")[1]);
				int e =Integer.parseInt(linie.split(";")[2]);
				int r = Integer.parseInt(linie.split(";")[3]);
				int t = Integer.parseInt(linie.split(";")[4]);
				pachete.setNume(q);
				pachete.setNumarPackete(w);
				pachete.setCartiInPacket(e);
				pachete.setCartiInPacket(r);
				pachete.setDust(t);
				System.out.println(results[0] + " " + results[1] + " " + results[2] + " " + results[3] + " " + results[4]);
			//	System.out.println(oa.getQability()+ " "+oa.getWability());
				linie = reader.readLine();
				assertEquals(q,pachete.getNume());
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		
		
	}
	
	@Test
	public void testnrpachet() {
		PurchasedPacks pachete = new PurchasedPacks();
		
		try{
			String linie = reader.readLine();
			while(linie != null){
				String[] results = linie.split(";");
				String q =results[0];
				int w = Integer.parseInt(linie.split(";")[1]);
				int e =Integer.parseInt(linie.split(";")[2]);
				int r = Integer.parseInt(linie.split(";")[3]);
				int t = Integer.parseInt(linie.split(";")[4]);
				pachete.setNume(q);
				pachete.setNumarPackete(w);
				pachete.setCartiInPacket(e);
				pachete.setCartiInPacket(r);
				pachete.setDust(t);
				System.out.println(results[0] + " " + results[1] + " " + results[2] + " " + results[3] + " " + results[4]);
			//	System.out.println(oa.getQability()+ " "+oa.getWability());
				linie = reader.readLine();
				assertEquals(w,pachete.getNumarPackete());
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	
	@Test
	public void testCartiPachet() {
		PurchasedPacks pachete = new PurchasedPacks();
		
		try{
			String linie = reader.readLine();
			while(linie != null){
				String[] results = linie.split(";");
				String q =results[0];
				int w = Integer.parseInt(linie.split(";")[1]);
				int e =Integer.parseInt(linie.split(";")[2]);
				int r = Integer.parseInt(linie.split(";")[3]);
				int t = Integer.parseInt(linie.split(";")[4]);
				pachete.setNume(q);
				pachete.setNumarPackete(w);
				pachete.setCartiInPacket(e);
				pachete.setCartiInPacket(r);
				pachete.setDust(t);
				System.out.println(results[0] + " " + results[1] + " " + results[2] + " " + results[3] + " " + results[4]);
			//	System.out.println(oa.getQability()+ " "+oa.getWability());
				linie = reader.readLine();
				assertEquals(e,pachete.getCartiInPacket());
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}

	
	@Test
	public void testCartiLaFel() {
		PurchasedPacks pachete = new PurchasedPacks();
		
		try{
			String linie = reader.readLine();
			while(linie != null){
				String[] results = linie.split(";");
				String q =results[0];
				int w = Integer.parseInt(linie.split(";")[1]);
				int e =Integer.parseInt(linie.split(";")[2]);
				int r = Integer.parseInt(linie.split(";")[3]);
				int t = Integer.parseInt(linie.split(";")[4]);
				pachete.setNume(q);
				pachete.setNumarPackete(w);
				pachete.setCartiInPacket(e);
				pachete.setCartiInPacket(r);
				pachete.setDust(t);
				System.out.println(results[0] + " " + results[1] + " " + results[2] + " " + results[3] + " " + results[4]);
			//	System.out.println(oa.getQability()+ " "+oa.getWability());
				linie = reader.readLine();
				assertEquals(r,pachete.getCartiLaFel());
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	
	@Test
	public void testDust() {
		PurchasedPacks pachete = new PurchasedPacks();
		
		try{
			String linie = reader.readLine();
			while(linie != null){
				String[] results = linie.split(";");
				String q =results[0];
				int w = Integer.parseInt(linie.split(";")[1]);
				int e =Integer.parseInt(linie.split(";")[2]);
				int r = Integer.parseInt(linie.split(";")[3]);
				int t = Integer.parseInt(linie.split(";")[4]);
				pachete.setNume(q);
				pachete.setNumarPackete(w);
				pachete.setCartiInPacket(e);
				pachete.setCartiInPacket(r);
				pachete.setDust(t);
				System.out.println(results[0] + " " + results[1] + " " + results[2] + " " + results[3] + " " + results[4]);
			//	System.out.println(oa.getQability()+ " "+oa.getWability());
				linie = reader.readLine();
				assertEquals(t,pachete.getDust());
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}

}
