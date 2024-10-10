package com.entreprise.modeles;

public abstract class Media {
	private String nom;
	private int taille;
	private String duration;
	private final TypesMedia type;
	
	
	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	
	public Media() {
		this("Inconnu", 0, TypesMedia.Inconnu, "00:00");
	}
	
	public Media(String nom, int taille, TypesMedia type, String duration) {
		this.nom = nom;
		this.taille = taille;
		this.type = type;
		this.duration = duration;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	public TypesMedia getType() {
		return type;
	}
	
	//Methode abstracte
	public abstract void afficherMedia();
	
	
}
