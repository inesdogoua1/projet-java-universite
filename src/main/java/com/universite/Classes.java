package main.java.com.universite;

import java.util.ArrayList;
import java.util.Scanner;

public class Classes {
	
	public static ArrayList<String>listClasses = new ArrayList<>();
	
	 // methode liste des classes
		
		public static void listeClasses() {
		
		listClasses.add("Licence1_WMBI");
		listClasses.add("Licence2_WMBI");
		listClasses.add("Licence3_WMBI");

				}


				//afficher liste des classes
	public static void afficherListClasses(){
		System.out.println(listClasses);
	}
		
		//methode gestion des classes
		public static void gestionClasse() {
			System.out.println("1.Ajouter une nouvelle classe");
			try (Scanner clavier = new Scanner(System.in)) {
				int choix= clavier.nextInt();
				
				if(choix==1) {
					int stop=0;
					
					do {
						System.out.print("Veuillez renseigner le nom de la classe que vous voulez ajouter:");
						String nomDeClasse=clavier.next();
						
						listClasses.add(nomDeClasse);
						System.out.println(listClasses);
						
						System.out.println("Appuyez 1 pour arreter et 0 pour continuer");
						 stop = clavier.nextInt();
					}while(stop==0);
				}else {
					System.out.println("Choix indisponible.");
				}
			}
			revenirAuMenu();
				
			
			
			
		}
		

		
		//revenir au menu principal
		public static void revenirAuMenu() {
			try (Scanner clavier = new Scanner(System.in)) {
				System.out.println("1.Revenir au menu principal\n2.Quitter");
				
				int choix= clavier.nextInt();
				
				if(choix==1) {
					Universite.menu();
					
				}
				else { 
					System.out.println("Merci pour votre visite!!!");
					return ;
				}
			}
		}
}
