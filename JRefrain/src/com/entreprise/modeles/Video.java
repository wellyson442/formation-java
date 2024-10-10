package com.entreprise.modeles;

public abstract class Video extends Media {
	

	public Video() {
		this("Inconnu", 0, "00:00", TypesMedia.Video);
	}
	
	public Video(String nom, int taille, String duration, TypesMedia type) {
		super(nom, taille, type, duration);
	}
	
	
}
