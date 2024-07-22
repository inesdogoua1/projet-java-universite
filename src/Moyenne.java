import java.util.HashMap;

public class Moyenne {

	//liste des notes
	
	public static HashMap<String,Double> etudiantNote=new HashMap<>();
	
			
	//methode gestion des notes
	public static void gestNotes() {
		
		etudiantNote.put("math",5.0);
		etudiantNote.put("java",15.5);
		etudiantNote.put("html",9.0);
		
		System.out.println(etudiantNote);
		
		
		System.out.println("Que voulez vous faire?");
		System.out.println("1.Enregistrer les notes par matiere\n2.Calculer les moyennes par matiere ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
