package entity.pokemons;

import entity.Golpe;
import entity.Pokemon;
import files.TypeChart;

public class Pidgey extends Pokemon {

	public static Pidgey creat() {
		Golpe ataques[] = new Golpe[4];
		int tipo = TypeChart.getTipo("Flying");

		ataques[0] = new Golpe("Tackle", false, 50, "Normal");
		ataques[1] = new Golpe("Ventania", true, 40, "Flying");
		ataques[2] = new Golpe("Tornado", true, 40, "Flying");
		ataques[3] = new Golpe("Teco Teco BR", true, 99999, "Flying");

		return new Pidgey("Pidgey", ataques, 40, 45, 40, tipo, 35, 35, 56);

	}

	private Pidgey(String nome, Golpe ataques[], int vida, int ataque,
			int defesa, int tipo, int espAtaque, int espDefesa, int velocidade) {
		super(nome, ataques, vida, ataque, defesa, tipo, espAtaque, espDefesa,
				velocidade);
	}
}
