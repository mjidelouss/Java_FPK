package exercice7;

public class Article {
	double prix_achat ;
	double prix_vente ; 
	String nom ;
	String fournisseur ;
	
	public double taux_de_rendement() {
		return prix_vente - prix_achat ;
	}

	public String toString() {
		return "Article [prix_achat=" + prix_achat + ", prix_vente=" + prix_vente + ", nom=" + nom + ", fournisseur="
				+ fournisseur + "]";
	}
	
	

}
