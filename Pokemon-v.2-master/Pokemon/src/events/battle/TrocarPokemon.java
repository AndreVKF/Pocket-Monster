package events.battle;

import entity.Jogador;
import events.Event;

public class TrocarPokemon extends Event {

	int index;
	Jogador player;
	
	public TrocarPokemon(int index, Jogador player) {
		super(2);
		this.index = index;
		this.player = player;
	}

	@Override
	public void action() {
		player.setPokemon(index);
	}

	@Override
	public String description() {
		return player.getPokemon().nome+", eu escolho voce!";
	}

}
