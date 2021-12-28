package exercice7;

public class Electromenagers extends Article implements ProduitSolde
{
	private double	voltage;
	private String	marque;
	
	public Electromenagers(double voltage, String marque) 
	{
		this.voltage = voltage;
		this.marque = marque;
	}
	
	public Electromenagers(double prixAchat, double prixVente, String nomProduit, String nomFournisseur, double voltage, String marque)
	{
		super(prixAchat, prixVente, nomProduit, nomFournisseur);
		this.voltage = voltage;
		this.marque = marque;
	}

	public void lancerSolde(double pourcentage)
	{
		this.prixVente *= pourcentage/100; 
	}
	
	public void terminerSolde(double pourcentage)
	{
		this.prixVente *= 100/pourcentage;
	}
}
