package com.entreprise.modeles;

public class Album {
	private String nom;
	private Song[] listeMusiques;
	private int nbMusiques = 0;
	private static final int nbMusiquesMax = 20;
	
	public Album() {
		this("Inconnu");
	}
	
	/**
	 * @param String nom
	 **/
	public Album(String nom) {
		this.nom = nom;
		this.listeMusiques = new Song[nbMusiquesMax];
	}
	
	public void ajouterMusique(Song musique) {
		
		//On vérifie si l'album est complet
		if(this.nbMusiques == nbMusiquesMax) {
			System.err.println("Impossible d'ajouter la musique \""+ musique.getNom() +"\", l'Album est complet (" + Album.nbMusiquesMax + "/" + this.nbMusiques + ")");
			return;
		} else if(estDejaDansAlbum(musique)) {
			System.err.println("La musique \"" + musique.getNom() + "\" est déjà présente dans l'Album");
			return;
		} else {
			musique.setTrackNumber(nbMusiques);
			this.listeMusiques[nbMusiques] = musique;
			this.nbMusiques++;
			
			System.out.println("Musique \"" + musique.getNom() +"\" ajoutée dans l'Album \"" + this.getNom() + "\"");
		}
	}
	
	private boolean estDejaDansAlbum(Song musique) {
		for (int i = 0; i < this.listeMusiques.length; i++) {
			if(this.listeMusiques[i] == null) continue;
			
			if(this.listeMusiques[i].getNom().equalsIgnoreCase(musique.getNom())) {
				return true;
			}
		}
		
		return false;
	}
	
	
	public void supprimerMusique(int a, int b) {
		int curseur = 0;
		for (int i = a; i <= b; i++) {
			this.supprimerMusique(i - curseur);
			curseur++;
		}
	}

	public void supprimerMusique(int numeroMusique) {
		//Si le numéro n'est pas négatif et que le numéro n'est pas plus grand que la taille de l'album
		if(numeroMusique >= 0 && numeroMusique < this.nbMusiques) {
			if(this.listeMusiques[numeroMusique] != null) {
				this.listeMusiques[numeroMusique] = null;
				this.nbMusiques--;	
				
				System.out.println("Musique supprimée");
				this.reorganiserMusiques();
			} else {
				System.out.println("Il n'y a pas de musique avec ce numéro");
			}
		} else {
			System.out.println("Veuillez saizir un numéro de musique valide (entre 0 et " + (this.nbMusiques-1));
		}
	}
	
	private void reorganiserMusiques() {
		for (int i = 0; i < listeMusiques.length - 1; i++) {
			if(listeMusiques[i] == null && listeMusiques[i+1] != null) {
				//Si l'emplacement en cours est vide et que le suivant ne l'est pas
				//On déplace la musique à l'emplacement en cours
				listeMusiques[i] = listeMusiques[i+1];
				
				//On change le numéro de musique
				listeMusiques[i].setTrackNumber(listeMusiques[i].getTrackNumber() - 1);
				
				listeMusiques[i+1] = null;
			}
		}
	}

	public int getNombreMusiques() {
		return this.nbMusiques;
	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Song[] getListeMusiques() {
		return listeMusiques;
	}

	public void setListeMusiques(Song[] listeMusiques) {
		this.listeMusiques = listeMusiques;
	}
	
	
	public void afficherAlbum() {
		System.out.println("- - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("Album : " + this.getNom());
		for (int i = 0; i < listeMusiques.length; i++) {
			if(listeMusiques[i] != null) {
				System.out.println(listeMusiques[i].getTrackNumber() + ": " + listeMusiques[i].getNom() + " " + listeMusiques[i].getDuration());				
			}
		}
	}
	
	
}
