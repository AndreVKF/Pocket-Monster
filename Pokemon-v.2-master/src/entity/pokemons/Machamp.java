package entity.pokemons;

import entity.Golpe;
import entity.Pokemon;
import files.TypeChart;

public class Machamp extends Pokemon {
	public static Machamp create() {
		Golpe ataques[] = new Golpe[4];
		int tipo = TypeChart.getTipo("Fighting");

		ataques[0] = new Golpe("Tackle", false, 50, "Normal");
		ataques[1] = new Golpe("Karate Chop", false, 50, "Fighting");
		ataques[2] = new Golpe("One Inch Punch", false, 90, "Fighting");
		ataques[3] = new Golpe("Batata Doce Monstro", false, 99999, "Fighting");

		return new Machamp("Machamp", ataques, 999, 100, 70, tipo, 50, 60, 65);

	}

	private Machamp(String nome, Golpe ataques[], int vida, int ataque,
			int defesa, int tipo, int espAtaque, int espDefesa, int velocidade) {
		super(nome, ataques, vida, ataque, defesa, tipo, espAtaque, espDefesa,
				velocidade);
	}

}
