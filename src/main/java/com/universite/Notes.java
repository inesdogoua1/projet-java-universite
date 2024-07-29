package main.java.com.universite;

import java.util.ArrayList;
import java.util.Scanner;

public class Notes {

    // Les variables
    static ArrayList<Double> listeNotes = new ArrayList<>();
    static boolean findeNote = false;
    static String reponse;

    // Vérifie si la note est valide
    public static boolean verifierNote(String noteStr) {
        try {
            double note = Double.parseDouble(noteStr);
            return note >= 0 && note <= 20;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Vérifier si la matière existe
    public static boolean verifierMatiere1(String matiere) {
        return Matiere.listMatieres.contains(matiere);
    }

    // Vérifier si le matricule existe
    public static boolean verifierMatricule1(String matricule) {
        for (Etudiants etudiant : Etudiants.listEtudiants) {
            if (etudiant.matricule.equals(matricule)) {
                return true;
            }
        }
        return false;
    }

    // Calcul de la moyenne
    public static double calculerMoyenne(ArrayList<Double> listeNotes) {
        double somme = 0;
        for (Double note : listeNotes) {
            somme += note;
        }
        return listeNotes.isEmpty() ? 0 : somme / listeNotes.size();
    }

    // Méthode pour ajouter les notes
    public static void ajouterNotes() {
        Scanner clavier = new Scanner(System.in);
        	
        	
			System.out.print("Entrez matricule: ");
			String matricule = clavier.next();
			if (!verifierMatricule1(matricule)) {
			    System.out.println("Matricule non trouvé.");
			    return;
			}

			System.out.print("Entrez matière: ");
			String matiere = clavier.next();
			if (!verifierMatiere1(matiere)) {
			    System.out.println("Matière non trouvée.");
			    return;
			}

			while (!findeNote) {
			    System.out.print("Entrez une note: ");
			    String noteStr = clavier.next();
			    if (verifierNote(noteStr)) {
			        double note = Double.parseDouble(noteStr);
			        listeNotes.add(note);
			    } else {
			        System.out.println("Note invalide. Veuillez entrer une note valide.");
			    }

			    System.out.print("Pour Terminer, entrez 1 : ");
			    reponse = clavier.next();
			    if (reponse.charAt(0)=='1') {
			        findeNote = true;
			    }
			}


			
			
        System.out.println("Liste des notes saisies : " + listeNotes);

        double moyenne = calculerMoyenne(listeNotes);

        System.out.println("Moyenne des notes : " + moyenne);
        
        
     // pour revenir au menu principal ou quitter
            System.out.println("1: Revenir au menu principal\n2. Quitter");
            String choix = clavier.next();
            
            if (choix.equals("1")) {
            	
                Universite.menu();
            } else if (choix.equals("2")) {
            	
                System.out.println("Au revoir!");
            } else {
            	
                System.out.println("Choix invalide. ");
            }
        
    }

            
    }
    

    	
    


	
				
				
			

	
	
	
	
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

