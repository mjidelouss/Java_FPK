package exercice7;
import java.util.Date;

public class Electromenagers extends Article implements  Susceptible_solde{

	int voltage ; 
	String marque ;

	public Electromenagers(int voltage, String marque)  {
	
		this.voltage = voltage;
		this.marque = marque;
	}
	
	public Electromenagers() {
		
	}
	//toString
	
	public String toString() {
		return "Electromenagers [voltage=" + voltage + ", marque=" + marque + ", prix_achat=" + prix_achat
				+ ", prix_vente=" + prix_vente + ", nom=" + nom + ", fournisseur=" + fournisseur + "]";
	}
	
	public void lancer_solde() {
		
	}

	public void terminer_solde() {
		
	}
	
	
	
	
	
}
