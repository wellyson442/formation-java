
public class TeamLeader extends Employe {

	private String titre;
	private int bonusSalaire;
	
	public TeamLeader() {
		super();
		this.titre = "Sans titre";
		this.bonusSalaire = 2000;
	}
	
	public TeamLeader(String prenom, String nom, int age, String poste, int salaire, String titre, int bonusSalaire) {
		super(nom, prenom, age, poste, salaire);
		this.titre = titre;
		this.bonusSalaire = bonusSalaire;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getBonusSalaire() {
		return bonusSalaire;
	}

	public void setBonusSalaire(int bonusSalaire) {
		this.bonusSalaire = bonusSalaire;
	}
	
	public void afficherTeamLeader() {
		super.afficherEmploye();
		System.out.println("titre : " + this.titre);
		System.out.println("Bonus : " + this.bonusSalaire);
	}
	
	
	
}
