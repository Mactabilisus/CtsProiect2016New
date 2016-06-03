package clase;

import interfete.ICardBuilder;

public class Card{
	private String nume;
	private int manaCost;
	private int attack;
	private int defence;
	private String rarity;
	private String ability;
	
	public static class CardBuilder implements ICardBuilder{
		public String nume;
		public int manaCost;
		public int attack;
		public int defence;
		public String rarity;
		public String ability;
		
		
		public CardBuilder nume(String nume)
		{
			this.nume = nume;
			return this;
		}
		
		public CardBuilder manaCost(int manaCost)
		{
			this.manaCost = manaCost;
			return this;
		}
		
		public CardBuilder attack(int attack)
		{
			this.attack = attack;
			return this;
		}
		
		public CardBuilder defence(int defence)
		{
			this.defence = defence;
			return this;
		}
		
		public CardBuilder rarity(String rarity)
		{
			this.rarity = rarity;
			return this;
		}
		
		public CardBuilder ability(String ability)
		{
			this.ability = ability;
			return this;
		}

		public Card build() {
			
			// TODO Auto-generated method stub
			return new Card(this);
		}

	}
	
	
	public Card(CardBuilder builder)
	{
		this.nume = builder.nume;
		this.manaCost = builder.manaCost;
		this.attack = builder.attack;
		this.defence = builder.defence;
		this.rarity = builder.rarity;
		this.ability = builder.ability;
	}

	@Override
	public String toString() {
		return "Card name : '' " + this.nume + "'', manaCost=" + this.manaCost + ", attack=" + this.attack + ", defence=" + this.defence
				+ ", rarity=" + this.rarity + ", ability=" + this.ability + " has been played on this turn";
	}
	
	
}
