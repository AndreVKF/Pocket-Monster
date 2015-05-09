package entity.pokemons;

import entity.Golpe;
import entity.Pokemon;
import files.TypeChart;

public class Blastoise extends Pokemon {

	public static Blastoise create() {
		Golpe ataques[] = new Golpe[4];
		int tipo = TypeChart.getTipo("Water");

		ataques[0] = new Golpe("Tackle", false, 50, "Normal");
		ataques[1] = new Golpe("Hydro Pump", true, 110, "Water");
		ataques[2] = new Golpe("Dig", true, 90, "Ground");
		ataques[3] = new Golpe("Cataratas do Iguaçu", true, 99999, "Water");

		return new Blastoise("Blastoise", ataques, 999, 83, 100, tipo, 85, 105, 78);

	}

	private Blastoise(String nome, Golpe ataques[], int vida, int ataque,
			int defesa, int tipo, int espAtaque, int espDefesa, int velocidade) {
		super(nome, ataques, vida, ataque, defesa, tipo, espAtaque, espDefesa,
				velocidade);
	}
}
