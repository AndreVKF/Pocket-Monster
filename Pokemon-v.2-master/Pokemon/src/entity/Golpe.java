package entity;

import files.TypeChart;



public class Golpe {
	
	private String nome;
	private boolean especial;
	private int dano;
	private int tipo;

	public Golpe(String nome, boolean especial, int dano, String tipo) {
		this.nome = nome;
		this.especial = especial;
		this.dano = dano;
		this.tipo = TypeChart.getTipo(tipo);
	}
	
	public String print() {
		String str = nome;
		if (especial) str += "(Especial)";
		return str;
	}
	
	public int getDano() {
		return this.dano;
	}
	public int getTipo() {
		return this.tipo;
	}
	public boolean isEspecial() {
		return this.especial;
	}
}
