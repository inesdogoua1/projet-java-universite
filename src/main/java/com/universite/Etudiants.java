package com.universite;

import java.util.ArrayList;
import java.util.Scanner;


public class Etudiants {
	
	public static ArrayList<Etudiants>listEtudiants = new ArrayList<>();
	
	//les attributs de letudiant
	 String nom;
	 String prenom;
	 String dateDeNaissance;
	 String matricule;
	 String classe;
	 
	 //ajouter les etudiants
	 
	 public static void ajouterEtudiants() {
		Etudiants nouvelEtudiant =new Etudiants();
		 
		 Scanner clavier = new Scanner(System.in);
		 System.out.println("nom:");
		 nouvelEtudiant.nom=clavier.next();
		 System.out.println("prenom :");
		 nouvelEtudiant.prenom=clavier.next();
		 System.out.println("date de naissance:");
		 nouvelEtudiant.dateDeNaissance=clavier.next();
		 System.out.println("matricule:");
		 nouvelEtudiant.matricule=clavier.next();
		 System.out.println("classe:");
		 nouvelEtudiant.classe=clavier.next();
		 
		 listEtudiants.add(nouvelEtudiant);
		 System.out.println(listEtudiants);
		 
	 }
	
	//methode gestion des etudiants
		public static void gestionEtudiants() {
					
			System.out.println("1.Ajouter un etudiant");
			Scanner clavier = new Scanner(System.in);
			int choix= clavier.nextInt();
			if(choix==1) {
				int stop=0;
				
				do {
					ajouterEtudiants();
					
					
					System.out.println("Appuyez 1 pour arreter et 0 pour continuer");
					 stop = clavier.nextInt();
				}while(stop==0);
			}else {
				System.out.println("Choix indisponible.");
			}
			
			Classes.revenirAuMenu();
			
			
		}
	
	
		
	}

	
	


