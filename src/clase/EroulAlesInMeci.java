package clase;

import interfete.IAlegeErou;

public class EroulAlesInMeci implements IAlegeErou {
	private String numeErou;
	private String abilitate;
	private int healthPool;
	private int numarCarti;
	
	public EroulAlesInMeci(String numeErou) {
		this.numeErou = numeErou;
	}
	
	public void setAbilitate(String abilitate) {
		this.abilitate = abilitate;
	}

	public void setHealthPool(int healthPool) {
		this.healthPool = healthPool;
	}

	public void setNumarCarti(int numarCarti) {
		this.numarCarti = numarCarti;
	}

	@Override
	public void eroul_ales() {
		System.out.println("L-ai ales pe : "+numeErou+". El/ea are urmatoarea abilitate: '"
	+abilitate + "' care costa 2 cristale de mana."+ "\n"+ "Viata totala a eroului de :"
				+healthPool+" si numarul de carti: "+numarCarti);

	}

}
