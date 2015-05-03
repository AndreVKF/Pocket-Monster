package entity;



public class Pokemon {
	
	public final int vidaMaxima;
	
	public Golpe ataques[];
	public String nome;
	public int tipo;
	
	public int vida, ataque, defesa;
	public int espAtaque, espDefesa;
	public int velocidade;
	
	public Pokemon(String nome, Golpe ataques[], int vida, int ataque, int defesa, 
					int tipo, int espAtaque, int espDefesa, int velocidade) {
		
		this.nome = nome;
		this.vida = vida;
		this.tipo = tipo;
		this.ataque = ataque;
		this.defesa = defesa;
		this.ataques = ataques;
		this.vidaMaxima = vida;
		this.espAtaque = espAtaque;
		this.espDefesa = espDefesa;
		this.velocidade = velocidade;
	}
	
	public void printAtaques() {
		System.out.println("(Opcao)(Ataque)");
		for (int i = 0; i < ataques.length; i++) {
			System.out.println(i+": "+ataques[i].print());
		}
	}
	
	public int getTipo() {
		return this.tipo;
	}
}
