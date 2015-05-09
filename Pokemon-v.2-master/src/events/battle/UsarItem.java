package events.battle;

import entity.Item;
import entity.Pokemon;
import events.Event;

public class UsarItem extends Event {

	Pokemon pokemon;
	Item item;
	
	int vidaCarregada;
	
	public UsarItem(Item item, Pokemon pokemon) {
		super(3);
		this.pokemon = pokemon;
		this.item = item;
	}

	@Override
	public void action() {
		vidaCarregada = item.vida;
		pokemon.vida += item.vida;
		if (pokemon.vida > pokemon.vidaMaxima)
			pokemon.vida = pokemon.vidaMaxima;
	}

	@Override
	public String description() {
		return pokemon.nome+" carregou "+vidaCarregada+" pts. de vida.";
	}

}
