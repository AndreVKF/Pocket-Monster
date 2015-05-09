package entity.pokemons;

import entity.Golpe;
import entity.Pokemon;
import files.TypeChart;

public class Bulbasaur extends Pokemon {

	public static Bulbasaur create() {
		
		Golpe ataques[] = new Golpe[4];
		int tipo = TypeChart.getTipo("Grass");

		ataques[0] = new Golpe("Tackle", false, 50, "Normal");
		ataques[1] = new Golpe("Chicote de cipó", true, 45, "Grass");
		ataques[2] = new Golpe("Folha Gillete", true, 55, "Grass");
		ataques[3] = new Golpe("Oregano da FFLCH", true, 99999, "Psychic");

		return new Bulbasaur("Bulbasaur", ataques, 999, 49, 49, tipo, 65, 49, 45);
	}

	private Bulbasaur(String nome, Golpe ataques[], int vida, int ataque,
			int defesa, int tipo, int espAtaque, int espDefesa, int velocidade) {
		super(nome, ataques, vida, ataque, defesa, tipo, espAtaque, espDefesa,
				velocidade);
	}
}
