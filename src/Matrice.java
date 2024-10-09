
public class Matrice {
	public static void main(String[] args) {
		int x = 20;
		int y = 20;
		String[][] matrice = new String[x][y];
		
		
		initialiserMatrice(matrice, x, y);
		
		afficherNumero(matrice, x, y);
	
		
	}

	public static void afficherMatrice(String[][] matrice, int x, int y) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(matrice[i][j]);
			}
			System.out.println("");
		}
	}

	public static void initialiserMatrice(String[][] matrice, int x, int y) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				matrice[i][j] = "   ";
			}
		}
	}
	
	public static void afficherNumero(String[][] matrice, int x, int y) {
		
		boolean withPause = true;
		
		afficher0(matrice, x, y, withPause);
		
		initialiserMatrice(matrice, x, y);
		clearConsole();
		
		afficher8(matrice, x, y, withPause);
		
		initialiserMatrice(matrice, x, y);
		clearConsole();
		
		afficher3(matrice, x, y, withPause);
		
		initialiserMatrice(matrice, x, y);
		clearConsole();
		
		afficher5(matrice, x, y, withPause);
		
		pause(1000);
		initialiserMatrice(matrice, x, y);
		
		afficher8(matrice, x, y, withPause);
		
		
		
		pause(1000);
		clearConsole();
		afficherMatrice(matrice, x, y);
	}

	public static void afficher0(String[][] matrice, int x, int y, boolean withPause) {
		//Barre supérieure du huit
		for (int i = 0; i < 8; i++) {
			matrice[0][i] = " x ";
	
			
			
			if (withPause) {
				clearConsole();
				afficherMatrice(matrice, x, y);
				pause(10);
			}
		}
		
		//Barre droite du zero
		for (int i = 0; i < 20; i++) {
			matrice[i][8] = " x ";
			
			if (withPause) {
				clearConsole();
				afficherMatrice(matrice, x, y);
				pause(10);
			}
		}
		
		//Barre inférieure du zero
		for (int i = 8; i > 0; i--) {
			matrice[19][i] = " x ";
	
			
			if (withPause) {
				clearConsole();
				afficherMatrice(matrice, x, y);
				pause(10);
			}
		}
		
		//Barre gauche du zero
		for (int i = 19; i > 0; i--) {
			matrice[i][0] = " x ";
			
			if (withPause) {
				clearConsole();
				afficherMatrice(matrice, x, y);
				pause(10);
			}
		}
		
		if(!withPause) {
			afficherMatrice(matrice, x, y);
		}
	}
	
	public static void afficher8(String[][] matrice, int x, int y, boolean withPause) {
		//Barre supérieure du huit
		for (int i = 0; i < 8; i++) {
				matrice[0][i] = " x ";
	
			
			clearConsole();
			afficherMatrice(matrice, x, y);
			if (withPause) pause(10);
		}
		
		//Barre droite du huit
		for (int i = 0; i < 20; i++) {
				matrice[i][8] = " x ";
			
			clearConsole();
			afficherMatrice(matrice, x, y);
			if (withPause) pause(10);
		}
		
		//Barre inférieure du huit
		for (int i = 8; i > 0; i--) {
				matrice[19][i] = " x ";
	
			
			clearConsole();
			afficherMatrice(matrice, x, y);
			if (withPause) pause(10);
		}
		
		//Barre gauche du huit
		for (int i = 19; i > 0; i--) {
				matrice[i][0] = " x ";
			
			clearConsole();
			afficherMatrice(matrice, x, y);
			if (withPause) pause(10);
		}
		
		//Barre du milieu du huit
		for (int i = 0; i < 8; i++) {
			matrice[10][i] = " x ";
	
			
			clearConsole();
			afficherMatrice(matrice, x, y);
			if (withPause) pause(10);
		}
	}
	
	public static void afficher3(String[][] matrice, int x, int y, boolean withPause) {
		//Barre supérieure du trois
		for (int i = 0; i < 8; i++) {
				matrice[0][i] = " x ";
	
			
			clearConsole();
			afficherMatrice(matrice, x, y);
			if (withPause) pause(10);
		}
		
		//Barre droite du trois
		for (int i = 0; i < 20; i++) {
				matrice[i][8] = " x ";
			
			clearConsole();
			afficherMatrice(matrice, x, y);
			if (withPause) pause(10);
		}
		
		//Barre inférieure du trois
		for (int i = 8; i >= 0; i--) {
				matrice[19][i] = " x ";
	
			
			clearConsole();
			afficherMatrice(matrice, x, y);
			if (withPause) pause(10);
		}
		
		//Barre du milieu du trois
		for (int i = 1; i < 8; i++) {
			matrice[10][i] = " x ";
	
			
			clearConsole();
			afficherMatrice(matrice, x, y);
			if (withPause) pause(10);
		}
	}
	
	public static void afficher5(String[][] matrice, int x, int y, boolean withPause) {
		//Barre supérieure du trois
		int i = 7;
		
		//Barre haut 5
		while(i > 0) {
			matrice[0][i] = " x ";
	
			
			clearConsole();
			afficherMatrice(matrice, x, y);
			if (withPause) pause(10);
			
			i--;
		}
		
		
		//Barre gauche 5
		i = 0;
		while(i < 7) {
			matrice[i][0] = " x ";
	
			
			clearConsole();
			afficherMatrice(matrice, x, y);
			if (withPause) pause(10);
			
			i++;
		}
		
		
		//Barre milieu 5
		i=0;
		while(i <= 7) {
			matrice[7][i] = " x ";
	
			
			clearConsole();
			afficherMatrice(matrice, x, y);
			if (withPause) pause(10);
			
			i++;
		}
		
		
		//Barre droite 5
		i = 7;
		while(i < 14) {
			matrice[i][7] = " x ";
	
			
			clearConsole();
			afficherMatrice(matrice, x, y);
			if (withPause) pause(10);
			
			i++;
		}
		
		//Barre bas 5
		i=7;
		while(i >= 0) {
			matrice[14][i] = " x ";
	
			
			clearConsole();
			afficherMatrice(matrice, x, y);
			if (withPause) pause(10);
			
			i--;
		}
	}
	
	public static void afficher2(String[][] matrice, int x, int y, boolean withPause) {
		
		int i = 0;
		
		
		//Barre haut 2
		while(i < 7) {
			matrice[0][i] = " x ";
	
			
			clearConsole();
			afficherMatrice(matrice, x, y);
			if (withPause) pause(10);
			
			i++;
		}
	}
	
	public static void bougerPerso(String[][] matrice, int x, int y, boolean withPause) {
		clearConsole();
		
		for (int j = 0; j < x; j++) {
			for (int i = 0; i < y; i++) {
				matrice[j][i] = " x ";
				
				afficherMatrice(matrice, x, y);
				
				matrice[j][i] = " . ";
				
				
				pause(300);
				
				clearConsole();
				
				
			}
		}
		
		
	}

	public static void pause(int mSec) {
		try {
		    Thread.sleep(mSec);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	}
	
	
	public static void clearConsole() {
        try {
            // Pour Windows
            if (System.getProperty("os.name").toLowerCase().contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Pour Unix/Linux/Mac
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	
}
