package entity.pokemons;

import entity.Golpe;
import entity.Pokemon;
import files.TypeChart;

public class Jigglypuff extends Pokemon {

	public static Jigglypuff create() {
		Golpe ataques[] = new Golpe[4];
		int tipo = TypeChart.getTipo("Normal");

		ataques[0] = new Golpe("Tackle", false, 50, "Normal");
		ataques[1] = new Golpe("Mega murro", true, 110, "Normal");
		ataques[2] = new Golpe("Hyper voz", true, 90, "Ground");
		ataques[3] = new Golpe("Algebra Linear II", true, 99999, "Water");

		return new Jigglypuff("Fajardao", ataques, 999, 45, 20, tipo, 45, 25,
				20);

	}

	private Jigglypuff(String nome, Golpe ataques[], int vida, int ataque,
			int defesa, int tipo, int espAtaque, int espDefesa, int velocidade) {
		super(nome, ataques, vida, ataque, defesa, tipo, espAtaque, espDefesa,
				velocidade);
	}

}
