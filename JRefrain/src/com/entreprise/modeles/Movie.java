package com.entreprise.modeles;

public class Movie extends Video {

	private String director;
	private String[] acteurs;
	
	

	public Movie() {
		this("Inconnu", "Inconnu", 0, "00:00", new String[]{}, TypesMedia.Movie);
	}
	
	/**
	 * <h1> Wellyson DOS SANTOS :) </h1> 
     * @param String directeur
     * @param String nom
     * @param int taille
     * @param String duration
     * @param String[] acteurs
     * @param TypesMedia type
     * 
     */
	public Movie(String director, String nom, int taille, String duration, String[] acteurs, TypesMedia type) {
		super(nom, taille, duration, type);
		this.director = director;
		this.acteurs = acteurs;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String[] getActeurs() {
		return acteurs;
	}

	public void setActeurs(String[] acteurs) {
		this.acteurs = acteurs;
	}

	@Override
	public void afficherMedia() {
		System.out.println("Nom : " + this.getNom());
		System.out.println("Durée : " + this.getDuration());
		System.out.println("Type : " + this.getType());
	}

	
	
	
	
	
}
