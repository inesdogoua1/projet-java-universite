package main.java.com.universite;

import java.util.ArrayList;
import java.util.Scanner;

public class Matiere {
	
	public static ArrayList<String>listMatieres = new ArrayList<>();
	
	//methode gestion des matieres
	
	
			public static void gestionMatieres() {
							
				
				System.out.println("1.Ajouter une matiere");
				Scanner clavier = new Scanner(System.in);
					int choix= clavier.nextInt();
					
					if(choix==1) {
						int stop=0;
						
						do {
							System.out.println("Veuillez entrer le nom de la matiere que vous souhaitez ajouter:") ;
							String nomDeMatiere=clavier.next();
							
							listMatieres.add(nomDeMatiere);
							System.out.println(listMatieres);
							// revenir au menu
							System.out.println("Appuyez 1 pour arreter et 0 pour continuer");
							stop = clavier.nextInt();
							if(stop==1) {
								Universite.menu();
							}
							
							
							 
							
						}while(stop==0);
					}else {
						System.out.println("Choix indisponible.");
					}
				
				
				
							
								
			}

	//methode liste des matieres
		public static void listMatieres() {
			
			
			
			listMatieres.add("Algorithme");
			listMatieres.add("HTML");
			listMatieres.add("CSS");
			listMatieres.add("JavaScript");
		
						
					//System.out.println(listMatieres);
					}	

}
