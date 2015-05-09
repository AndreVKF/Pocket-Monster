package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TypeChart {

	public static enum Effect {
		METADE, DOBRO, ANULA, COMUM
	}
	
	static String type[];
	static Effect chart[][];

	public static void loadPokemonTypeChart() {
		
		String linha, comando[];
		boolean table = false, names = false;
		int index = 0;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("assets/TypeChart.txt"));
			
			while((linha = br.readLine()) != null) {
				
				// Linhas de comentarios
				if(linha.startsWith("#")) continue;
				
				// Inicializa a tabela de efeitos no programa
				else if (linha.contains("START TYPES")) {
					comando = linha.split("\\(|\\)");
					int size = Integer.parseInt(comando[1]);
					
					TypeChart.chart = new Effect[size][size];
					TypeChart.type = new String[size];
					names = true;
				}
				
				// Instrucoes de leitura genericas
				else if (linha.contains("END TYPES")) names = false;
				else if (linha.contains("START TABLE")) table = true;
				else if (linha.contains("END TABLE")) table = false;
				
				// Leitura de dados
				else if (names) {
					comando = linha.split(":");
					int i = Integer.parseInt(comando[0]);
					type[i] = comando[1];
				}
				else if (table) {
					comando = linha.split("\\s+");
					for (int col = 0; col < chart.length; col++)
						switch (comando[col]) {
						case "C": chart[index][col] = Effect.COMUM;  break;
						case "M": chart[index][col] = Effect.METADE; break;
						case "D": chart[index][col] = Effect.DOBRO;  break;
						case "N": chart[index][col] = Effect.ANULA;  break;
						}
					index++;
				}
			}
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static double getAlpha(int tipoAtaque, int tipoOponente) {
		Effect effect = chart[tipoAtaque][tipoOponente];
		
		switch (effect) {
		case DOBRO: return 2.0;
		case ANULA: return 0.0;
		case METADE: return 0.5;
		default: return 1.0;
		}
	}
	
	public static int getTipo(String tipo) {
		for (int i = 0; i < type.length; i++) {
			if (type[i].equals(tipo)) return i;
		}
		return -1;
	}
}
