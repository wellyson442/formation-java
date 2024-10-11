package batailleNavale;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Champs {

	private static final int tailleX = 2;
	private static final int tailleY = 2;
	private static int nbBombes;
	
	private static Map<String, Integer> champs = new HashMap<>();
	private static Map<String, Integer> bombes = new HashMap<>();
	
	
	public void initialiserChamps() {
		for (int x = 0; x < this.tailleX; x++) {
			for (int y = 0; y < this.tailleY; y++) {
				String pos = x + "," + y;
				champs.put(pos, 0);
			}
		}
	}
	
	public void generedBombes() {
		for (int i = 0; i < this.nbBombes; i++) {
			//Récupère une position aléatoire pour une bombe
			String pos = randNumber(this.tailleX) + "," + randNumber(this.tailleY);
			
			bombes.put(pos, 1);
		}
	}	

	
	public void inialiserChampsAvecNombreBombes() {
		for (int x = 0; x < this.tailleX; x++) {
			for (int y = 0; y < this.tailleY; y++) {
				int compteurBombes = 0;
				
				//s'il y a une bombe exactement sur la case en cours
				if(bombes.get(x+","+y).equals(1)) {
					//Le 999 indique que c'est une bombe qu'on affichera
					champs.put(x+","+y, 999);
					continue;
				}
				
				//On vérifie s'il y a une bombe sur la case x+1,y
				if(bombes.get((x+1)+","+y).equals(1)) {
					compteurBombes++;
				}
				
				//On vérifie s'il y a une bombe sur la case x-1,y
				if(bombes.get((x-1)+","+y).equals(1)) {
					compteurBombes++;
				}
				
				//On vérifie s'il y a une bombe sur la case x,y+1
				if(bombes.get(x+","+(y+1)).equals(1)) {
					compteurBombes++;
				}
				
				//On vérifie s'il y a une bombe sur la case x,y-1
				if(bombes.get(x+","+(y-1)).equals(1)) {
					compteurBombes++;
				}
				
				//On vérifie s'il y a une bombe sur la case x+1,y+1
				if(bombes.get((x+1)+","+(y+1)).equals(1)) {
					compteurBombes++;
				}
				
				//On vérifie s'il y a une bombe sur la case x+1,y-1
				if(bombes.get((x+1)+","+(y-1)).equals(1)) {
					compteurBombes++;
				}
				
				//On vérifie s'il y a une bombe sur la case x-1,y+1
				if(bombes.get((x-1)+","+(y+1)).equals(1)) {
					compteurBombes++;
				}
				
				//On vérifie s'il y a une bombe sur la case x-1,y-1
				if(bombes.get((x-1)+","+(y-1)).equals(1)) {
					compteurBombes++;
				}
			}
		}
	}
	
	public static int randNumber(int b) {
		Random rand = new Random();

		// Obtain a number between [0 - b+1].
		int n = rand.nextInt(b+1);
		
		return n;
	}
	
//	for (String key : champs.keySet()) {
//    System.out.println("Key: " + key + ", Valeur: " + champs.get(key));
//}



//Récupérer une valeur à l'aide de la clé.
//champs.get(key)
//Modifier valeur avec clé
//champs.put(pos, compteur);
	
	
	
}
