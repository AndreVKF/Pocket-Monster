package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WorldGen {

	private static WorldTile[][] tiles;
	
	public static void loadWorld() {
		
		String linha, comando[];
		boolean par = true;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("assets/mundo.txt"));
			
			comando = br.readLine().split("\\(|,|\\)");
			tiles = new WorldTile[Integer.parseInt(comando[1])][Integer.parseInt(comando[2])];
			
			while((linha = br.readLine()) != null) {
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
