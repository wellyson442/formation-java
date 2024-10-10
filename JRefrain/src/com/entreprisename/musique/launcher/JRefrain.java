package com.entreprisename.musique.launcher;

import java.util.ArrayList;
import java.util.List;

import com.entreprise.modeles.Album;
import com.entreprise.modeles.Song;

public class JRefrain {

	public static void main(String[] args) {
		
		List<String[]> musiquesAAjouter = new ArrayList<>();
		
		musiquesAAjouter.add(new String[]{"Papercut", "3:05"});
		musiquesAAjouter.add(new String[]{"Papercut", "3:05"});
		musiquesAAjouter.add(new String[]{"One Step Closer", "2:55"});
		musiquesAAjouter.add(new String[]{"With You", "3:23"});
		musiquesAAjouter.add(new String[]{"Points of Authority", "3:20"});
		musiquesAAjouter.add(new String[]{"Crawling", "3:29"});
		musiquesAAjouter.add(new String[]{"Runaway", "3:04"});
		musiquesAAjouter.add(new String[]{"By Myself", "3:10"});
		musiquesAAjouter.add(new String[]{"In the End", "3:36"});
		musiquesAAjouter.add(new String[]{"A Place for My Head", "3:05"});
		musiquesAAjouter.add(new String[]{"Forgotten", "3:14"});
		musiquesAAjouter.add(new String[]{"Cure for the Itch", "2:37"});
		musiquesAAjouter.add(new String[]{"Pushing Me Away", "3:11"});
			
		Album premierAlbum = new Album("Hybrid Theory");
		
		for (String[] musique : musiquesAAjouter) {			
			premierAlbum.ajouterMusique(new Song(musique[0], 10, musique[1]));
        }
		
//		Test ajout d'une musique qui existe déjà ou Album plein
//		premierAlbum.ajouterMusique(new Song("Musique n° 8", 10, 8));
		
		premierAlbum.afficherAlbum();
		
		premierAlbum.supprimerMusique(3, 11);
		
		premierAlbum.supprimerMusique(0);
		
		premierAlbum.supprimerMusique(0);
		
		premierAlbum.supprimerMusique(0);
		
		premierAlbum.supprimerMusique(0);
		
		premierAlbum.afficherAlbum();
//		premierAlbum.supprimerMusique(10);
		
		
	}

}
