package clase;

import interfete.IGameType;
import interfete.IStandard;
import interfete.ITavernBrawl;
import interfete.IWild;

public class CreateGame implements IGameType {

	@Override
	public IStandard game_type_standard() {
		// TODO Auto-generated method stub
		return new SelectedGameStandard();
	}

	@Override
	public IWild game_type_wild() {
		// TODO Auto-generated method stub
		return new SelectedGameWild();
	}

	@Override
	public ITavernBrawl game_type_tavern() {
		// TODO Auto-generated method stub
		return new SelectedGameTavern();
	}

}
