package main.java.com.universite;

import java.util.ArrayList;

import java.util.Scanner;

public class Notes {
	
	 //les variables
	 static ArrayList<String> listeNotes = new ArrayList<>();
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

 
	 
	 //vérifier si la matiere existe
	public static boolean verifierMatiere1(String matiere) {
		if(Matiere.listMatieres.contains(matiere)) {
			return true;
		}else {
			return false;
		}
	}
	
	//la fonction pour verifier que le matricule existe
	public static boolean verifierMatricule1(String matricule) {
		
		boolean etudiantExiste = false;
		 for(Etudiants etudiant:Etudiants.listEtudiants) {
			 if(etudiant.matricule.equals(matricule)) {
				 etudiantExiste = true;
			 }
			 
		 }		 		 
		return etudiantExiste;
		
	}
	
	// calcul de moyenne
	public static double calculerMoyenne(ArrayList<String> listeNotes) {
        double somme = 0;
        for (String note : listeNotes) {
            somme += note;
        }
        return listeNotes.isEmpty() ? 0 : somme / listeNotes.size();
    }

	 
	//les attributs de levaluation
		 String matricule;
		 String matiere;
		 ArrayList<Double> listeNote;
		 
	 //methode pour ajouter les notes
	 
	 public static void ajouterNotes() {
		 Scanner clavier=new Scanner (System.in);
		 System.out.print("Entrez matricule: ");
		 String matricule = clavier.nextLine();
	        verifierMatricule1(matricule);
	        
	     System.out.print("Entrez matiere: ");
	     String matiere = clavier.nextLine();
	        verifierMatiere1(matiere);
		 
	        while (!findeNote) {		 
			 System.out.print("Entrez une note: ");
			 String note = clavier.nextLine();
	            if (verifierNote(note)) {
	                listeNotes.add(note);
	            } else {
	                System.out.println("Note invalide. Veuillez entrer une note valide.");
	            }

	            System.out.print("Pour Terminer, entrez 1 : ");
	            reponse = clavier.nextLine();
	            if (reponse.equals("1")) {
	                findeNote = true;
	            }
	        }

	        System.out.println("Liste des notes saisies : " + listeNotes);
	        
	        double moyenne = calculerMoyenne(listeNotes);
	        
	        System.out.println("Moyenne des notes : " + moyenne);
	       Classes.revenirAuMenu();
	    }
			 
	 
	
		 
	 }
	 
	
				
				
			

	
	
	
	
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

