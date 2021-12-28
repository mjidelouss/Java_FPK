package exercice7;
import java.util.Date ;

public class Primeurs extends Article {
	Date date_peremption ;

	public Primeurs(Date date_peremption) {
		super();
		this.date_peremption = date_peremption;
	}

	public Primeurs() {
		
	}

	public String toString() {
		return "Primeurs [date_peremption=" + date_peremption + ", prix_achat=" + prix_achat + ", prix_vente="
				+ prix_vente + ", nom=" + nom + ", fournisseur=" + fournisseur + "]";
	}
}
