package main;

import clase.Card;
import clase.CareTaker;
import clase.CreateGame;
import clase.ErouAlesFactory;
import clase.EroulAlesInMeci;
import clase.GameCommand;
import clase.MomentInJoc;
import clase.Originator;
import clase.PauzaCommand;
import clase.ReluareCommand;
import clase.SingletonGame;
import clase.TheAlmightyLagCommand;
import clase.TurnBased;
import clase.User;
import interfete.IGameType;
import interfete.IStandard;
import interfete.IWild;

public class Main {

	public static void main(String[] args) {
		SingletonGame object = SingletonGame.getInstance();
		object.showMessage();
		System.out.println("\n");
		
		//only 1 instance can be started
		
		
		IGameType jocul_1 = new CreateGame();
		IStandard standard_1 = jocul_1.game_type_standard();
		
		//standard is more competitive
		//while wild is more fun
		//tavern brawl is only 3 days a week available
		
		System.out.println(standard_1.game());
		System.out.println("\n");
		
		User you = new User("You");
		User opponent = new User("Opponent");
		
		you.sendMessage("Greetings , traveler");
		opponent.sendMessage("Greetings");
		System.out.println("\n");
		
		//eroi = {"Jaina, Rexxar, Garrosh, Anduin, Gul'dan, Thrall, Valeera, Uther, Malfurion"};
		
		EroulAlesInMeci hero_1 = (EroulAlesInMeci)ErouAlesFactory.getNume("Garrosh");
		hero_1.setAbilitate("Armor up");
		hero_1.setHealthPool(30);
		hero_1.setNumarCarti(30);
		hero_1.eroul_ales();
		System.out.println("\n");
		
		MomentInJoc subiect = new MomentInJoc();
		
		//turn based games means you need an observer
		
		new TurnBased(subiect);
		
		System.out.println("Incepe jocul");
		subiect.setMoment(1);
		System.out.println("\n");
		
		Card card1 = new Card.CardBuilder().nume("Lepper Gnome").manaCost(1).attack(1).defence(1).rarity("Common").build();
		//.Ability("Deathrattle: When the minion dies deal 1 damage to the other player")
		System.out.println(card1.toString());
		
		
		System.out.println("Runda ta s-a terminat");
		subiect.setMoment(2);
		System.out.println("\n");
		
		Card card2 = new Card.CardBuilder().nume("Knife Juggler").manaCost(2).attack(2).defence(3).rarity("Rare").ability("Whenever you summon a minion deal 1 damage to a random character").build();
		System.out.println(card2.toString());
		
		System.out.println("Runda ta s-a terminat");
		subiect.setMoment(3);
		System.out.println("\n");
		
		GameCommand cevaNeasteptat = new GameCommand();
		PauzaCommand pauza = new PauzaCommand(cevaNeasteptat);
		ReluareCommand reluare = new ReluareCommand(cevaNeasteptat);
		
		TheAlmightyLagCommand lag = new TheAlmightyLagCommand();
		lag.daComanda(pauza);
		lag.daComanda(reluare);
		
		lag.executaOrders();
		System.out.println("\n");
		
		
		Originator orig = new Originator();
		CareTaker ct = new CareTaker();
		
		orig.setState("Lepper Gnome ataca pentru 1 damage");
		orig.setState("Lepper Gnome ataca pentru 2 damage");
		ct.add(orig.saveState());
		
		orig.setState("Lepper Gnome ataca pentru 2 damage + 1 de la crearea unui nou erou");
		ct.add(orig.saveState());
		orig.setState("Knife Juggler foloseste abilitatea pentru 1 damage pe erou");
		orig.getStateFromMem(ct.get(0));
		System.out.println("adversarul foloseste heal si revenim la prima stare slavata");
		System.out.println("Prima stare salvata : " + orig.getState());
		
		/*IGameType jocul_2 = new CreateGame();
		IWild wild_1 = jocul_2.game_type_wild();
		System.out.println(wild_1.game());
		*/

	}

}
