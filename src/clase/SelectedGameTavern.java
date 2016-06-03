package clase;

import interfete.ITavernBrawl;

public class SelectedGameTavern implements ITavernBrawl {

	@Override
	public String game() {
		return "A tavern brawl game is a different kind of game. Players may use only specific"
				+ "abilities or only specific decks or are agains AI";
	}

}
