package main.java.com.universite;

import java.util.Scanner;

public class Authentification {
	//declaration des variables
	
	//variable identifiant
	static int id = 12369874; 
			
	// variable code secret
	static int codeScrt = 1234;
			
	
	//methode identifiant
	
	public static boolean authentification() {
		System.out.print("Veuillez entrer votre identifiant:");
		Scanner clavier = new Scanner(System.in);
			int identifiant = clavier.nextInt();
			
			if(identifiant==id) {
				return true;
			}
			
			else {
			
			return false;
			}
		}
		
		
		 // methode code secret
		
		
		public static boolean codeSecret() {
			System.out.print("Veuillez entrer votre code secret:");
			Scanner clavier = new Scanner(System.in);
				int code = clavier.nextInt();
				
				if(code==codeScrt) {
					return true;
				}
				
				else {
				
				return false;
				}
			
			
			}
}
