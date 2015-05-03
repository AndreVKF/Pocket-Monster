package entity;

public class Jogador {

	private Pokemon pokemon[];
	private Item mochila[];
	
	public static final int EQUIPAR = -1;
	
	private int currPokemon = EQUIPAR;
	
	public Jogador(Pokemon pokemon[], Item mochila[]) {
		this.pokemon = pokemon;
		this.mochila = mochila;
	}
	
	public void printPokemon() {
		System.out.println("(Opcao)(Pokemon)");
		for (int i = 0; i < pokemon.length; i++) {
			System.out.println(i+": "+pokemon[i].nome);
		}
	}
	
	public void printItem() {
		System.out.println("(Opcao)(Item)");
		for (int i = 0; i < mochila.length; i++) {
			System.out.println(i+": "+mochila[i].nome);
		}
	}
	
	public void printAtaques() {
		pokemon[currPokemon].printAtaques();
	}
	
	public boolean setPokemon(int opt) {
		if (opt < pokemon.length & opt >= 0) {
			this.currPokemon = opt;
			return true;
		}
		else {
			System.out.println("");
			return false;
		}
	}
	public Pokemon getPokemon() {
		return pokemon[currPokemon];
	}
	public Item getItem(int index) {
		return mochila[index];
	}
}
