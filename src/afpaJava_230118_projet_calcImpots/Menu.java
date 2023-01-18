package afpaJava_230118_projet_calcImpots;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu {

	static String listeMenu[] = {
			"1: Créer une commune",
			"2: Créer une habitation",
			"3: Ajouter habitation à une commune",
			"4: Modifier propriétaire d'une maison",
			"5: Afficher toutes les habitations créées",
			"6: Afficher les habitations d'une commune",
			"7: Quitter"
	};
	
	
	static Scanner scan = new Scanner(System.in);
	static void afficherMenu(String message) {
		cls();
		System.out.println(message);
		System.out.println("--- Menu ---");
		for (String e: listeMenu) {
			System.out.println(e);
		}
		int choixMenu = scan.nextInt();
		switch (choixMenu) {
		case 1: 
			menu1();
			break;
		case 2: 
			menu2();
			break;
		case 3: 
			menu3();
			break;
		case 4: 
			menu4();
			break;
		case 5: 
			menu5();
			break;
		case 6: 
			menu6();
			break;
		case 7: 
			menu7();
			break;
		}
	}
	
	
	static void cls() {
		for (int i = 0; i < 50; ++i) System.out.println();
	}

	// créer commune
	static void menu1() {
		cls();
		System.out.println("Nom de la commune :");
		scan.nextLine(); String nom = scan.nextLine();
		//créer commune
		new Commune(nom);
		cls();
		afficherMenu("Commune '" + nom + "' créée");
	}
	

	// créer habitation
	static void menu2() {
		cls();
		System.out.println("Propriétaire :");
		scan.nextLine(); String proprietaire = scan.nextLine();
		System.out.println("Adresse :");
		String adresse = scan.nextLine();
		System.out.println("Surface :");
		double surface = scan.nextDouble();
		System.out.println("Type (1: individuelle / 2: professionnelle");
		int typeChoix = scan.nextInt();
		if (typeChoix == 1) {
			String type = "individuelle";
			System.out.println("Nombre de pièces :");
			int nbPieces = scan.nextInt();
			System.out.println("Présence piscine (1: oui / 2: non");
			boolean piscine = scan.nextInt() == 1 ? true : false;
			new HabitationIndividuelle(proprietaire, adresse, surface, nbPieces, piscine);
		} else {
			String type = "professionnelle";
			System.out.println("Nombre d'employés :");
			int nbEmployes= scan.nextInt();
			new HabitationProfessionnelle(proprietaire, adresse, surface, nbEmployes);
		}
		afficherMenu("");
	}
	

	// ajouter habitation à une commune
	static void menu3() {
		cls();
		Habitation.afficherListeDeToutesLesHabitations();
		System.out.println("Sélection n° habitation :");
		int choixHab = scan.nextInt();
		
		Commune.afficherListeDesCommunes();
		System.out.println("Sélection n° commune :");
		int choixCommune = scan.nextInt();
		
		Commune.listeDesCommunes.get(choixCommune - 1).ajoutHabitation(Habitation.listeDeToutesLesHabitations.get(choixHab - 1));
		afficherMenu("L'habitation n°" + choixHab + " a été ajoutée à la commune de " + Commune.listeDesCommunes.get(choixCommune - 1).getNom());;
	}
	
	// modifier proprio
	static void menu4() {
		cls();
		Habitation.afficherListeDeToutesLesHabitations();
		System.out.println("Sélection n° habitation :");
		int choixHab = scan.nextInt();
		Habitation habitationChoisie = Habitation.listeDeToutesLesHabitations.get(choixHab - 1);
		
		System.out.println("Nom du propriétaire :");
		scan.nextLine(); String nouveauProprio = scan.nextLine();
		
		habitationChoisie.setProprietaire(nouveauProprio);
		afficherMenu("Modification propriétaire habitation n°" + choixHab + "\tnom :" + nouveauProprio);
		
	}
	
	static void menu5() {
		cls();
		Habitation.afficherListeDeToutesLesHabitations();
		System.out.println("(Retour : Enter)");
		String s = scan.nextLine();s = scan.nextLine();
		afficherMenu("");
	}

	static void menu6() {
		cls();
		Commune.afficherListeDesCommunes();
		System.out.println("Sélection n° commune :");
		int choixCommune = scan.nextInt();
		Commune communeChoisie = Commune.listeDesCommunes.get(choixCommune - 1);
		communeChoisie.afficherHabitations();
		
		System.out.println("(Retour : Enter)");
		Scanner s = new Scanner(System.in);
		s.nextLine();
		afficherMenu("");
	}

	
	static void menu7() {
		cls();
		System.out.println("Au revoir.");
		System.exit(0);
	}
	
	
	
}
