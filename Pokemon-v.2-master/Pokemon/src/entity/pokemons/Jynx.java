package entity.pokemons;

import entity.Golpe;
import entity.Pokemon;
import files.TypeChart;

public class Jynx extends Pokemon {

	public static Jynx create() {
		Golpe ataques[] = new Golpe[4];
		int tipo = TypeChart.getTipo("Ice");

		ataques[0] = new Golpe("Tackle", false, 50, "Normal");
		ataques[1] = new Golpe("Bitoca maligna", true, 75, "Psychic");
		ataques[2] = new Golpe("Avalanche", true, 90, "Ice");
		ataques[3] = new Golpe("Abraço Travestido", true, 99999, "Normal");

		return new Jynx("Jynx", ataques, 65, 50, 35, tipo, 115, 95, 95);

	}

	private Jynx(String nome, Golpe ataques[], int vida, int ataque,
			int defesa, int tipo, int espAtaque, int espDefesa, int velocidade) {
		super(nome, ataques, vida, ataque, defesa, tipo, espAtaque, espDefesa,
				velocidade);
	}

}
