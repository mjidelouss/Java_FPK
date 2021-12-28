package exercice7;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Primeur extends Article implements ProduitPerime
{
	private LocalDate datePeremption;
	
	public Primeur()
	{
		super();
	}

	public Primeur(double prixAchat, double prixVente, String nomProduit, String nomFournisseur, LocalDate datePeremption) {
		super(prixAchat, prixVente, nomProduit, nomFournisseur);
		this.datePeremption = datePeremption;
	}
	
	public LocalDate datePeremption()
	{
		return datePeremption;
	}
	
	public int getJoursRestants()
	{
		return (int)ChronoUnit.DAYS.between(LocalDate.now(), datePeremption);
	}
}
