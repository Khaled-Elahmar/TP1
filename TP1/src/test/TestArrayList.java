package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestArrayList {
	
    public static void main(String[] args) {
    	List<String> listeDeString = new ArrayList<>();

        listeDeString.add("USA ");
        listeDeString.add("China");
        listeDeString.add("Japan");
        listeDeString.add("Germany");;
        listeDeString.add("France");
        
        int nombreDElements = listeDeString.size();
        System.out.println("Le nombre d'éléments dans la liste est : " + nombreDElements);
        displayList(listeDeString);
     // Modifier la valeur à la position "3" par "Tunisia"
        int position = 3;
        String nouvelleValeur = "Tunisia";
        listeDeString.set(position - 1, nouvelleValeur);

        // Afficher la liste mise à jour
        System.out.println("Liste mise à jour : " + listeDeString);
     // Trier la liste par ordre alphabétique
        Collections.sort(listeDeString);

        // Afficher la liste triée
        System.out.println("Liste triée : " + listeDeString);
     // Vider la liste
        listeDeString.clear();

        // Afficher la liste après l'avoir vidée (elle sera vide)
        System.out.println("Liste vidée : " + listeDeString);
    }
    private static void displayList(List<String> list) {
      for(String e:list) {
    	  System.out.println("--"+e);
      }
    	}

       
}