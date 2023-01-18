package afpaJava_230118_projet_calcImpots;

public class HabitationIndividuelle extends Habitation {

	private int nbPieces;
	private boolean piscine;
//	private String type = "individuelle";

	public HabitationIndividuelle(String proprietaire, String adresse, double surface, int nbPieces, boolean piscine) {
		super(proprietaire, adresse, surface);
		this.nbPieces = nbPieces;
		this.piscine = piscine;
		this.type = "individuelle";
		listeDeToutesLesHabitations.add(this);
	}

	public double impot() {
		double res = super.impot() + nbPieces * 100;
		res += (piscine == true) ? 500 : 0;
		return res;
	}

	public String toString() {
		return "prop: " + super.getProprietaire() + "\tadresse: " + super.getAdresse() + "\t surface: "
				+ super.getSurface() + "\t n_pièces:" + nbPieces + "\t piscine: " + piscine;
	}

}
