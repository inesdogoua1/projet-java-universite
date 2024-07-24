package com.universite;

import java.util.Scanner;

public class Universite {
	//methode principale
	public static void main(String[] args) {
		
		Classes.listeClasses();
		Matiere.listMatieres();
		System.out.println("BIENVENU A L UNIVERSITE PAUL MARIE");
					
		if (Authentification.authentification()){
			
			if (Authentification.codeSecret()){
				
				menu();
				
			}
			else {
				System.out.println("erreur de code.");
			}
			
		}
		else {
			System.out.println("Identifiant incorrect");
		}
		
		
		
		//Etudiants.listEtudiants();
		
	}

	//methode menu
	public static void menu(){
		System.out.println("1.Gestion des classes\n2.Gestion des etudiants\n3.Gestion des matieres\n4.Enregistrer des notes\n5.Generer les bulletins\n6.Quitter");
	System.out.println("Veuillez choisir une option: ");
	
	Scanner clavier = new Scanner(System.in);
	int choix= clavier.nextInt();

	switch(choix) {
		case 1:Classes.gestionClasse();
		break;
		case 2:Etudiants.gestionEtudiants();
		break;
		case 3:Matiere.gestionMatieres();
		break;
		case 4:
			Classes.afficherListClasses();
			Moyenne.gestNotes();

		break;
		case 5:	
		default:menu();

	}
	
	}
}
