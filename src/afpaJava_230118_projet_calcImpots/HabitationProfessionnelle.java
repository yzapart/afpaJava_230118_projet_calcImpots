package afpaJava_230118_projet_calcImpots;

public class HabitationProfessionnelle extends Habitation{

	private int nbEmployes;
//	private String type = "professionnelle";

	public HabitationProfessionnelle(String proprietaire, 
									 String adresse, 
									 double surface, 
									 int nbEmployes
									 ) {
		super(proprietaire, adresse, surface);
		this.nbEmployes = nbEmployes;
		this.type = "professionnelle";
		listeDeToutesLesHabitations.add(this);

	}

	public double impot() {
		return super.impot() + 1000 * nbEmployes / 10;
	}

	public String toString() {
					return "prop: " + super.getProprietaire() +
					"\tadresse: " + super.getAdresse() +
					"\t surface: " + super.getSurface() +
					"\t nbEmployes:" + nbEmployes;
					}
		
}
