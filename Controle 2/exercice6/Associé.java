package exercice6;

import java.util.Date;

public class Associe extends Employe{
	
	private static double chiffre_affaires;
	private double BN ;
    private double pourcentage;



	public Associe(int matricule, String nom, String prenom, Date date_naissance, double chiffre_affaires, double bN, double pourcentage) {
		super(matricule, nom, prenom, date_naissance);
		this.chiffre_affaires = chiffre_affaires;
		BN = bN;
		this.pourcentage = pourcentage;
	}


	public String toString() {
		return "Associe [pourcentage=" + pourcentage + "]";
	}


	public  double getChiffre_affaires() {
		return chiffre_affaires;
	}

	public  void setChiffre_affaires(double chiffre_affaires) {
		Associe.chiffre_affaires = chiffre_affaires;
	}


	public double getPourcentage() {
		return pourcentage;
	}


	public void setPourcentage(double pourcentage) {
		this.pourcentage = pourcentage;
	}


	public double getBN() {
		return BN;
	}


	public void setBN(double bN) {
		BN = bN;
	}


	public double getSalaire() {
		
		return Math.round( (( BN * pourcentage / 100 ) / 12) )    ;
	}

	

}
