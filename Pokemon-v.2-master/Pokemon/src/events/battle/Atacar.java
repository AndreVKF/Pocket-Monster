package events.battle;

import entity.Golpe;
import entity.Pokemon;
import events.Event;

public class Atacar extends Event {

	Pokemon off, def;
	Golpe ataque;
	
	public Atacar(Golpe ataque, Pokemon off, Pokemon def) {
		super(off.velocidade);
		this.def = def;
		this.off = off;
	}

	@Override
	public void action() {
		
		
	}

	@Override
	public String description() {

		return null;
	}

	
}
