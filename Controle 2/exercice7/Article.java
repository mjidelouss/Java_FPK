package exercice7;

public class Article 
{
	protected double	prixAchat;
	protected double	prixVente;
	protected String	nomProduit;
	protected String	nomFournisseur;
	protected double	stock;
	
	public Article() 
	{
		
	}
	
	public Article(double prixAchat, double prixVente, String nomProduit, String nomFournisseur) 
	{
		this.prixAchat = prixAchat;
		this.prixVente = prixVente;
		this.nomProduit = nomProduit;
		this.nomFournisseur = nomFournisseur;
		this.stock = 0;
		
	}
	
	public double calculerTauxRedement()
	{
		return (this.prixVente - this.prixAchat);
	}
	
	public void afficherCaracteristiques()
	{
		System.out.println("[Nom : " + this.nomProduit + ", fournisseur : " + this.nomFournisseur + ", Prix : " + this.prixAchat + "]");
	}

	public String getNomProduit()
	{
		return this.nomProduit;
	}
}