package clase;

import java.util.ArrayList;
import java.util.List;

public class PurchasedPacks {
	public String numePacket;
	public int numarPackete;
	public int cartiInPacket;
	public int cartiLaFel;
	public int Dust;
	private List<String> carte = new ArrayList<String>();
	
	public String getNume()
	{
		return numePacket;
	}
	
	public void setNume(String numePacket) {
		if (numePacket != null && !numePacket.matches("[0-9]+")){
			this.numePacket = numePacket;
		}
		else if(numePacket == null)
		{
			throw new UnsupportedOperationException();
		}
		else
		{
			System.out.println("Numele este introdus gresit in numele packetului");
		}
		
	}

	public PurchasedPacks(String numePacket, int numarPackete, int cartiInPacket, int cartiLaFel, int dust) {
		super();
		if (numePacket != null && !numePacket.matches("[0-9]+")){
			this.numePacket = numePacket;
		}
		else
		{
			//System.out.println("Numele este introdus gresit in numele packetului");
		}
		if (numarPackete < 0 )
		{
			System.out.println("Numarul de packete nu poate fi mai mic ca 0");
		}
		else
		{
			this.numarPackete = numarPackete;
		}
		if (cartiInPacket <= 4 || cartiInPacket > 5)
		{
			System.out.println("Intr-un packet nu pot fi mai mult sau mai putin de 5 carti");
		}
		else
		{
			this.cartiInPacket = cartiInPacket;
		}
		if (cartiLaFel != 1 && cartiLaFel > 0)
		{
			System.out.println("Sunt "+ cartiLaFel + " carti la fel");
		}
		this.cartiLaFel = cartiLaFel;
		Dust = dust;
	}
	
	
	public PurchasedPacks() {
	
	}

	public void adaugaCarte(String nume)
	{
		carte.add(nume);
	}
	
	public int cartiTotale(int numarPackete, int cartiPacket)
	{
		return numarPackete * cartiPacket;
	}
	
	public int calculeazaDust(int cartiLaFel, int Dust,String raritate1,String raritate2)
	{
		if(cartiLaFel > 1)
		{
			if(raritate1.compareTo(raritate2) == 0)
			{
				if(raritate1.equalsIgnoreCase("common"))
				{
					Dust = 5; 
					return Dust;
				}
				else if(raritate1.equalsIgnoreCase("rare"))
				{
					Dust = 10;
					return Dust;
				}
				else if(raritate1.equalsIgnoreCase("epic"))
				{
					Dust = 50;
					return Dust;
				}
				else if(raritate1.equalsIgnoreCase("legendary"))
				{
					Dust = 400;
					return Dust;
				}
			}
		}
		return Dust;
	}

	public String getNumePacket() {
		return numePacket;
	}

	public void setNumePacket(String numePacket) {
		this.numePacket = numePacket;
	}

	public int getNumarPackete() {
		return numarPackete;
	}

	public void setNumarPackete(int numarPackete) {
		this.numarPackete = numarPackete;
	}

	public int getCartiInPacket() {
		return cartiInPacket;
	}

	public void setCartiInPacket(int cartiInPacket) {
		this.cartiInPacket = cartiInPacket;
	}

	public int getCartiLaFel() {
		return cartiLaFel;
	}

	public void setCartiLaFel(int cartiLaFel) {
		this.cartiLaFel = cartiLaFel;
	}

	public int getDust() {
		return Dust;
	}

	public void setDust(int dust) {
		Dust = dust;
	}

	public List<String> getCarte() {
		return carte;
	}

	public void setCarte(List<String> carte) {
		this.carte = carte;
	}
	
	
}
