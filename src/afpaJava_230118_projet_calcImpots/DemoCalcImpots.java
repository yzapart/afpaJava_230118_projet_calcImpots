package afpaJava_230118_projet_calcImpots;

import java.util.ArrayList;
import java.lang.Class;

public class DemoCalcImpots {

	public static void main(String[] args) {

		HabitationIndividuelle hi1 = new HabitationIndividuelle("Pierre", "3 rue allo", 42, 3, true);
//		System.out.println(hi1.toString());
//		System.out.println("impot : " + hi1.impot());
		
		HabitationIndividuelle hi2 = new HabitationIndividuelle("Papa", "1 rue bidul", 42, 3, false);
		HabitationIndividuelle hi3 = new HabitationIndividuelle("Cam", "9 rue Bleriot", 42, 3, false);
		HabitationProfessionnelle hp1 = new HabitationProfessionnelle("OVH", "3 rue truc", 42, 5);
		HabitationProfessionnelle hp2 = new HabitationProfessionnelle("Kebab", "49 rue Lune", 42, 23);
		
//		// Création tableau d'habitations t
//		ArrayList<Habitation> t = new ArrayList<Habitation>();
//		t.add(hi1);
//		t.add(hi2);
//		t.add(hi3);
//		t.add(hp1);
//		t.add(hp2);
//		
		new Commune("Roubaix");
		new Commune("Lille");
		new Commune("Tourcoing");
//		System.out.println("---");		
//		c.afficherHabitations();
//		System.out.println("---");		
//		System.out.println("Impot total ind. : " + c.impotTotal("individuelle"));
//		System.out.println("---");		
//		System.out.println("Impot total pro. : " + c.impotTotal("professionnelle"));
//		System.out.println("---");
//		System.out.println("Impot total ind. + pro. : " + (c.impotTotal("individuelle")	+ c.impotTotal("professionnelle")));	
//	
//		System.out.println(hi1.toString());
//		System.out.println(hp1.toString());
//		System.out.println("---");
//		
//		Habitation.afficherListeDeToutesLesHabitations();
		
		 Menu.afficherMenu("");
	
		// savoir de quelle classe s'agit une habitation :
		// habitation.instanceof(Habitation individuelle);
//		
//		System.out.println(hp2 instanceof HabitationProfessionnelle);
//		System.out.println(hp2 instanceof HabitationIndividuelle);
		
	}

}
