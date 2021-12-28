package exercice7; 
import java.util.Date;

public interface Produits {
	public Date date_fin_validite = new Date();
	public Date Date_de_peremption();
	public int jours_restant() ;
}
