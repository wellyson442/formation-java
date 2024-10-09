import java.util.Random;
import java.util.Scanner;

public class Backup {
	/*
	 * Ici une liste de methodes que j'ai fait et testé 
	 * pendant des exercices
	 * Je les gardes de côté pour backup
	 * 
	 */
	
	
	public static void tableauAleatoireClasser() {
		System.out.println("Combien de nombres voulez-vous générer ? ");
		//permet de récupérer ce qu'on saisi dans la console
		Scanner scanner = new Scanner(System.in);
		
		int[] arrayToSort;
		
		//Vérifie si l'utilisateur a saisi une valeur valide
		if(scanner.hasNextInt()) {
			int nVal = scanner.nextInt();
			
			arrayToSort = randTableau(nVal);
		} else {
			System.out.println("Vous n'avez pas saisi un nombre entier, alors la taille par défaut sera utilisée ");
			arrayToSort = randTableau(10);
		}
		
		
		scanner.close();
		
		
		System.out.println("Tableau initial : ");
		afficherTableau(arrayToSort);
		
		System.out.println("Tableau classé : ");
		afficherTableau(classerTableau(arrayToSort));
	}

	public static int[] classerTableau(int arrayToSort[]) {
		
		boolean isSwapped;
		int temp;
		int scoope = arrayToSort.length - 1;
		int count = 0;
		
		do{
			
			//Par défaut on dit qu'il n'y a pas eu d'échange
			isSwapped = false;
			
			for (int i = 0; i < scoope; i++) {
			
				
				if (arrayToSort[i] > arrayToSort[i+1]) {
					temp = arrayToSort[i+1];
					
					arrayToSort[i+1] = arrayToSort[i];
					arrayToSort[i] = temp;
					
					//Si un échange est fait alors ça veut dire qu'on a trouvé un 
					//élément plus grand que l'autre
					isSwapped = true;
	
				}
				
				count++;
			}
			
			scoope--;
			
			//Si on ne trouve pas d'élément plsu grand que l'autre alors
			//isSwapped est false et on arrête la boucle
		} while(isSwapped);
		
		
		System.out.println("Nombre de tours : " + count);
		
		return arrayToSort;
	}

	public static void afficherTableau(int arrayDisplay[]) {
		StringBuilder arrayString = new StringBuilder("{ ");
		
		for (int i = 0; i < arrayDisplay.length; i++) {
			arrayString.append(arrayDisplay[i]);
			
			if(i < arrayDisplay.length-1) {
				arrayString.append(", ");	
			}
		}
		
		arrayString.append(" }");
		
		System.out.println(arrayString);
	}

	public static void quelAgeAMonfils() {
		//Demande le prénom dans la console
				System.out.println("Comment vous appelez-vous ? ");
				
				
				//permet de récupérer ce qu'on saisi dans la console
				Scanner scanner = new Scanner(System.in);
				
				String prenom = scanner.next();
				
				//affiche le prénom
				System.out.println("Bonjour " + prenom + " !");
				
				System.out.println("Quel âge avez vous ? ");
				
				int age= scanner.nextInt();
				int vraiAgeFils = randNumber(age);
				
				System.out.println("Vous êtes  " + (calculerDifAge(age, vraiAgeFils)) + " ans plus vieux que mon fils !");
				
				int ageFils;
				System.out.println("Quelle age a mon fils ?");
				
				//Je demande l'age du fils
				ageFils = scanner.nextInt();
				
				
				//Si l'age saisi n'est pas bonne je redemande
				while(ageFils != vraiAgeFils) {
					System.out.println("Faux, réssayez : ");
					
					ageFils = scanner.nextInt();
				}
				
				
				System.out.println("BRAVO mon fils a " + vraiAgeFils + " ans ! ! ! !");
				
				
				//TODO ceci est une tâche test
				
				
				scanner.close();
	}
	
	public static int calculerDifAge(int age1, int age2) {
		int difAge = 0;
		
		difAge = age1 - age2;
		
		if(difAge < 0) difAge *= -1;
		
		return difAge;
	}

	public static int[] randTableau(int nVal) {
		int[] randTab = new int[nVal];
		
		for (int i = 0; i < randTab.length; i++) {
			//Faire des nombres négatifs de manière aléatoire
			int r = randNumber(10);
			if(r > 5) {
				//Créé un nombre aléatoire positif
				randTab[i] = randNumber(999);
			} else {
				//Créé un nombre aléatoire négatif
				randTab[i] = randNumber(999) * (-1);
			}
		}
		
		
		return randTab;
	}
	
	public static int randNumber(int b) {
		Random rand = new Random();

		// Obtain a number between [0 - b+1].
		int n = rand.nextInt(b+1);
		
		return n;
	}
	
	public static void demontrerErreurTailleInt(int b) {
		/*
		 * Permet de démontrer le probleme de capacité car le résultat ici de test + 10
		 * génère un résultat non conforme : -2147483639
		 * car "Integer" est stocké seulement sur 32bits donc max le nombre max est 2147483647
		 *
		 */
		
		Integer test = 2147483647;
		
		System.out.println(test + 10);
	}
}



