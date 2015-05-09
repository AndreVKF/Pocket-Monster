package events.battle;

import java.util.Scanner;

import entity.Golpe;
import entity.Item;
import entity.Jogador;
import events.Controller;
import events.Event;

public class BattleController extends Controller {

	public static boolean winner1 = false, winner2 = false;
	private static Scanner scan;
	
	public class Batalha extends Event {

		Jogador player1, player2;

		public Batalha(Jogador player1, Jogador player2, Scanner scan) {
			super(0);
			this.player1 = player1;
			this.player2 = player2;
			BattleController.scan = scan;
			
			scan = new Scanner(System.in);
			player1.setPokemon(trocar(player1, 1, scan));
			player2.setPokemon(trocar(player2, 2, scan));
		}

		@Override
		public void action() {

			choose(player1, 1, scan, player2);
			choose(player2, 2, scan, player1);
		}

		@Override
		public String description() {
			return "Fim de turno!";
		}

	}

	private int trocar(Jogador player, int n, Scanner scan) {
		System.out.println("Jogador "+n+", escolha um pokemon!\n");
		player.printPokemon();
		System.out.print("OPT > ");
		return scan.nextInt();
	}
	
	private Item item(Jogador player, int n, Scanner scan) {
		System.out.println("Jogador "+n+", escolha um item!\n");
		player.printItem();
		System.out.print("OPT > ");
		int opt = scan.nextInt();
		return player.getItem(opt);
	}
	
	private Golpe atacar(Jogador player, int n, Scanner scan) {
		System.out.println("Jogador "+n+", escolha um ataque!\n");
		player.printAtaques();
		System.out.print("OPT > ");
		int opt = scan.nextInt();
		return player.getPokemon().ataques[opt];
	}

	private void choose(Jogador player, int n, Scanner scan, Jogador challenger) {
		System.out.print("Jogador "+n+", escolha uma acao:\n(A)tacar\n(I)tem\n(T)rocar\n(F)ugir\nOPT > ");
		String entrada = scan.next();
		char opt = entrada.charAt(0);
		switch (opt) {
		case 'a':
			Golpe ataque = atacar(player, n, scan);
			this.addEvent(new Atacar(ataque, player.getPokemon(), challenger.getPokemon()));
			break;
		case 'i':
			Item item = item(player, n, scan);
			this.addEvent(new UsarItem(item, player.getPokemon()));
			break;
		case 't':
			int index = trocar(player, n, scan);
			this.addEvent(new TrocarPokemon(index, player));
			break;
		case 'f':
			if (n==1) winner2 = true;
			else winner1 = true;
			break;
		}
	}
}
