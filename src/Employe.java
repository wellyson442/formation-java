
public class Employe extends Personne {

	private String poste;
	private int salaire;
	
	public Employe() {
		super();
		this.poste = "Sans poste";
		this.salaire = 0;
	}

	public Employe(String nom, String prenom, int age, String poste, int salaire) {
		super(nom, prenom, age);
		this.poste = poste;
		this.salaire = salaire;
	}
	
	public void afficherEmploye() {
		super.afficherPersonne();
		System.out.println("Poste : " + this.poste);
		System.out.println("Salaire : " + this.salaire);
	}

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}
	
	
}
