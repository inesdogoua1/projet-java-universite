package com.universite;

import java.util.HashMap;
import java.util.Scanner;

public class Moyenne {

	//liste des notes
	
	public static HashMap<String,Double> etudiantNote=new HashMap<>();
	
			
	//methode gestion des notes
	public static void gestNotes() {

		System.out.println("Selectonnez une classe:");
		
		Scanner clavier = new Scanner(System.in);
		int choix= clavier.nextInt();
		
		if (choix<=3) {
			System.out.println("Selectonnez un etudiant:");
			Etudiants.ajouterEtudiants();
		}
		
		etudiantNote.put("Algorithme",5.0);
		etudiantNote.put("HTML",15.5);
		etudiantNote.put("CSS",9.0);
		etudiantNote.put("javaScript",9.0);
		
		System.out.println(etudiantNote);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
