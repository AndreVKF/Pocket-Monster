package entity.pokemons;

import entity.Golpe;
import entity.Pokemon;
import files.TypeChart;

public class Gyarados extends Pokemon {
	public static Gyarados create() {
		Golpe ataques[] = new Golpe[4];
		int tipo = TypeChart.getTipo("Water");

		ataques[0] = new Golpe("Hyper Fogo", true, 99999, "Fire");
		ataques[1] = new Golpe("Hyper Beam", true, 99999, "Normal");
		ataques[2] = new Golpe("Hyper Blado", true, 99999, "Psychic");
		ataques[3] = new Golpe("Se Fodeu", true, 99999, "Normal");

		return new Gyarados("Gyarados", ataques, 999, 125, 79, tipo, 60, 100, 81);

	}

	private Gyarados(String nome, Golpe ataques[], int vida, int ataque,
			int defesa, int tipo, int espAtaque, int espDefesa, int velocidade) {
		super(nome, ataques, vida, ataque, defesa, tipo, espAtaque, espDefesa,
				velocidade);
	}

}
