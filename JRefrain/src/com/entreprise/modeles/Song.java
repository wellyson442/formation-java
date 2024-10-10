package com.entreprise.modeles;
public class Song extends Media {
	private int trackNumber;
	
	
	public Song() {
		this("Inconnu", 0,  "00:00");
	}
	
	
	/**
	 * @param String nom
	 * @param int taille
	 * @param String duration
	 **/
	public Song(String nom, int taille, String duration) {
		super(nom, taille, TypesMedia.Song, duration);
		this.trackNumber = 0;
	}

	public int getTrackNumber() {
		return trackNumber;
	}

	public void setTrackNumber(int trackNumber) {
		this.trackNumber = trackNumber;
	}

	@Override
	public void afficherMedia() {
		System.out.println("Type : " + this.getType());
		System.out.println("Type : " + this.getNom());
	}
	
	
	
	
}
