package afpaJava_230118_projet_calcImpots;

import java.util.ArrayList;

public class Commune {
	
	private String nom;
	public static ArrayList<Habitation> listeHabitations = new ArrayList<Habitation>();
	
	// liste de l'ensemble des communes
	public static ArrayList<Commune> listeDesCommunes = new ArrayList<Commune>();
	
	public static void afficherListeDesCommunes() {
		System.out.println("--- Liste des communes : ---");
		int index = 1;
		for (Commune c : listeDesCommunes) {
			System.out.println(index + ": " + c.getNom());
			index += 1;
		}
	}
	
	public Commune(String nom) {
		this.nom = nom;
		listeDesCommunes.add(this);
	}
	
	
	public String getNom() {
		return nom;
	}
	
	public double impotTotal(String type) {
		int sum = 0;
		for (Habitation h: listeHabitations) {
			if (h.getType().equals(type)) {
				sum += h.impot();
			}
		}
		return sum;
	}
	
	public void afficherHabitations() {
		System.out.println("Liste des habitations de la commune de " + nom);
		for (Habitation h: listeHabitations) {
			System.out.println(h);
		}
	}

	public void ajoutHabitation(Habitation h) {
		listeHabitations.add(h);
	}
	
	
}
