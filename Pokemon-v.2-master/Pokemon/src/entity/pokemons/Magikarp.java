package entity.pokemons;

import entity.Golpe;
import entity.Pokemon;
import files.TypeChart;

public class Magikarp extends Pokemon {
	public static Magikarp create() {
		Golpe ataques[] = new Golpe[4];
		int tipo = TypeChart.getTipo("Water");

		ataques[0] = new Golpe("Ataque Bosta", false, 1, "Normal");
		ataques[1] = new Golpe("Ataque Inutil", false, 1, "Normal");
		ataques[2] = new Golpe("Ataque que não faz nada", false, 1, "Normal");
		ataques[3] = new Golpe("Splash", false, 0, "Normal");

		return new Magikarp("Magikarp", ataques, 20, 10, 55, tipo, 15, 20, 80);

	}

	private Magikarp(String nome, Golpe ataques[], int vida, int ataque,
			int defesa, int tipo, int espAtaque, int espDefesa, int velocidade) {
		super(nome, ataques, vida, ataque, defesa, tipo, espAtaque, espDefesa,
				velocidade);
	}

}
