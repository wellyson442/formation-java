
public class Vehicule {

	//champ/attribut/proriétés de la classe (caracteristiques)
	private String nom;
	private String marque;
	private String couleur;
	private int annee;
	private int nbPortes;
	
	//Le mot clé static dit qu'il s'agit d'un champs de la classe elle même et pas de l'objet
	//Si je veux accèder à cette information, je peux accèder directement en faisant NomClass.attributStatic
	//Peut être utilisé par exemple quand je veux faire des librairies avec des methodes utilitaires
	public static int compteur = 0;
	
	//Constructeur
	public Vehicule(String nom, String marque, String couleur, int annee, int nbPortes) {
		this.nom = nom;
		this.marque = marque;
		this.couleur = couleur;
		this.annee = annee;
		this.nbPortes = nbPortes;
	}
	
	//Constructeur vide
	public Vehicule() {
		this.nom = "Nom inconnu";
		this.marque = "Marque inconnue";
		this.couleur = "Couleur inconnue";
		this.annee = 0;
		this.nbPortes = 0;
	}
	
	
	//Methodes de la classe
	public void acceler() {
		
	}
	
	

	//Methodes de la classe
	public void afficher() {
		System.out.println("Nom : " + this.nom);
		System.out.println("Marque : " + this.marque);
		System.out.println("Couleur : " + this.couleur);
		System.out.println("Année : " + this.annee);
		System.out.println("Nombre de portes : " + this.nbPortes);
	}

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public int getNbPortes() {
		return nbPortes;
	}

	public void setNbPortes(int nbPortes) {
		this.nbPortes = nbPortes;
	}
	
	
}
