package game.core;

import java.util.Scanner;

import entity.Jogador;
import entity.Pokemon;
import entity.pokemons.Blastoise;
import entity.pokemons.Bulbasaur;
import entity.pokemons.Gengar;
import entity.pokemons.Gyarados;
import entity.pokemons.Jigglypuff;
import entity.pokemons.Jynx;
import entity.pokemons.Machamp;
import entity.pokemons.Magikarp;
import entity.pokemons.Pidgey;
import entity.pokemons.Pikachu;
import events.battle.BattleController;
import files.TypeChart;

public class Main {
	public static void main(String[] args) {
		
		TypeChart.loadPokemonTypeChart();
		
		Pokemon p1[] = new Pokemon[6];
		p1[0] = Bulbasaur.create();
		p1[1] = Gyarados.create();
		p1[2] = Gengar.create();
		p1[3] = Pidgey.creat();
		p1[4] = Blastoise.create();
		p1[5] = Magikarp.create();
		
		Pokemon p2[] = new Pokemon[6];
		p2[0] = Bulbasaur.create();
		p2[1] = Machamp.create();
		p2[2] = Pikachu.create();
		p2[3] = Pidgey.creat();
		p2[4] = Jynx.create();
		p2[5] = Jigglypuff.create();
		
		Jogador player1 = new Jogador(p1, null);
		Jogador player2 = new Jogador(p2, null);
		
		BattleController battle = new BattleController();
		Scanner scan = new Scanner (System.in);
		while(!(BattleController.winner1 | BattleController.winner2)) {
			battle.addEvent(battle.new Batalha(player1, player2, scan));
			battle.run();
			if(!arePokemonsAlive(player1)) BattleController.winner2 = true;
			if(!arePokemonsAlive(player2)) BattleController.winner1 = true;
		}
		if(BattleController.winner1)
			System.out.println("Fim da Batalha! Jogador 1 venceu!");
		else
			System.out.println("Fim da Batalha! Jogador 2 venceu!");
		scan.close();
	}
	
	public static boolean arePokemonsAlive(Jogador player) {
		for (int i = 0; i < 6; i++)
			if (player.getPokemon(i).vida >= 0) return true;
		return false;
	}
}
