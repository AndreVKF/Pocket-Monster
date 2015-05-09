package events.battle;

import java.util.Random;

import entity.Golpe;
import entity.Pokemon;
import events.Event;
import files.TypeChart;

public class Atacar extends Event {

	public static final int LEVEL = 55;
	
	Random random = new Random();
	Pokemon off, def;
	Golpe ataque;
	String texto;
	
	public Atacar(Golpe ataque, Pokemon off, Pokemon def) {
		super(off.velocidade);
		this.def = def;
		this.off = off;
		this.ataque = ataque;
	}

	@Override
	public void action() {
		
		double rand = random.nextDouble()*0.15 + 0.85;
		double alpha = TypeChart.getAlpha(ataque.getTipo(), def.tipo);
		double damage = (((2 * (double)LEVEL + 10) / 250) * ((double)off.ataque / (double)def.defesa) * (double)ataque.getDano() + 2) * alpha * rand;
		def.vida -= (int) damage;
		
		texto = "Pokemon "+off.nome+" causou "+damage+"pts de dano.";
		if (alpha == 0) texto += " Nao... ce eh burro cara, que loucura!";
		if (alpha == 0.5) texto += " O ataque foi meio bosta!";
		if (alpha == 1) texto += " Meh...";
		if (alpha == 2) texto += " Parabains! 'It's very effective!'";
	}

	@Override
	public String description() {
		
		if (def.vida <= 0) texto += " "+def.nome + " fainted.";
		return texto;
	}

	
}
