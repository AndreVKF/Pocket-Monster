package entity.pokemons;

import entity.Golpe;
import entity.Pokemon;
import files.TypeChart;

public class Gengar extends Pokemon {

	public static Gengar create() {
		Golpe ataques[] = new Golpe[4];
		int tipo = TypeChart.getTipo("Ghost");

		ataques[0] = new Golpe("Lambida", false, 40, "Ghost");
		ataques[1] = new Golpe("Murro Fantasma", true, 80, "Ghost");
		ataques[2] = new Golpe("Comedor de Sonhos", true, 90, "Psychic");
		ataques[3] = new Golpe("Mega HU3", true, 99999, "Ghost");

		return new Gengar("Gengar", ataques, 999, 65, 60, tipo, 130, 75, 110);

	}

	private Gengar(String nome, Golpe ataques[], int vida, int ataque,
			int defesa, int tipo, int espAtaque, int espDefesa, int velocidade) {
		super(nome, ataques, vida, ataque, defesa, tipo, espAtaque, espDefesa,
				velocidade);
	}
}
