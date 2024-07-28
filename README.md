UNIVERSITE PAUL MARIE

Développer une application Java pour gérer les notes des étudiants dans une
école.
L'application doit permettre l'administration des classes, des étudiants et des
matières, ainsi que l'enregistrement des notes, le calcul des moyennes,
l'établissement des classements et la génération des bulletins de notes.

1.AUTHENTIFICATION
identifiant: 12369874
mot de pass: 1234

2.menu principal

    1. Gestion des classes     
    2. Gestion des Etudiants   
    3. Gestion des Matieres    
    4. Enregistrer des notes 
    5. Quitter     

1. Gestion des classes
	- Ajouter des classes et les afficher

2. Gestion des Etudiants 
	- Ajouter des Etudiants et les afficher

3. Gestion des Matieres
	- Ajouter des matieres et les afficher

4. enregistrer des notes 
	- enregistrer les notes d'un etudiant par matiere a partir de son matricule
	- Calculer les  moyennes par matiere
	
5. Quitter
	- Fermer l'application     



3.Compilation et Création du JAR

Pour compiler et créer le JAR exécutable :

1. **Compilation :**
   ```
   mvn compile
   ```

2. **Création du JAR :**
   ```
   mvn package
   ```

   Cela va créer un fichier JAR dans le répertoire `target/`

### Exécution du JAR

Une fois le JAR créé, vous pouvez l'exécuter avec la commande suivante :

```
java -jar UNIVERSITE-1.0-SNAPSHOT.jar
```

