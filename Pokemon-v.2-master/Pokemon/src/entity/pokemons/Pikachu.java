package entity.pokemons;

import entity.Golpe;
import entity.Pokemon;
import files.TypeChart;

public class Pikachu extends Pokemon {

	public static Pikachu create() {
		Golpe ataques[] = new Golpe[4];
		int tipo = TypeChart.getTipo("Eletric");

		ataques[0] = new Golpe("Tackle", false, 50, "Normal");
		ataques[1] = new Golpe("Choque do Trovao", true, 40, "Eletric");
		ataques[2] = new Golpe("Murro Elétrico", false, 90, "Ground");
		ataques[3] = new Golpe("Fagulha de Kirchhoff", true, 99999, "Eletric");

		return new Pikachu("Pikachu", ataques, 35, 55, 40, tipo, 50, 50, 90);

	}

	private Pikachu(String nome, Golpe ataques[], int vida, int ataque,
			int defesa, int tipo, int espAtaque, int espDefesa, int velocidade) {
		super(nome, ataques, vida, ataque, defesa, tipo, espAtaque, espDefesa,
				velocidade);
	}

}
