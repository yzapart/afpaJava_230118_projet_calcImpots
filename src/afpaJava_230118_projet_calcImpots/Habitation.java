package afpaJava_230118_projet_calcImpots;

import java.util.ArrayList;


public class Habitation {

	private String proprietaire, adresse;
	private double surface;
	public String type;


	public Habitation(String proprietaire, String adresse, double surface) {
		this.proprietaire = proprietaire;
		this.adresse = adresse;
		this.surface = surface;
	}
	
	// liste de l'ensemble des habitations
	public static ArrayList<Habitation> listeDeToutesLesHabitations = new ArrayList<Habitation>();

	public static void afficherListeDeToutesLesHabitations() {
		System.out.println("--- Liste de toutes les habitations créées : ---");
		int index = 1;
		for (Habitation h : listeDeToutesLesHabitations) {
			System.out.println(index + ": " + h.toString());
			index += 1;
		}
	}

	public String getProprietaire() {
		return proprietaire;
	}
	
	public void setProprietaire(String nom) {
		this.proprietaire = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public double getSurface() {
		return surface;
	}

	public void affiche() {
		System.out.println("Propriétaire : " + proprietaire + "\tAdresse : " + adresse + "\tSurface : " + surface);
	}

	public double impot() {
		return 2 * surface;
	}
	
	public String getType() {
		return type;
	}

}
