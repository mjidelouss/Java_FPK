
public class Batiment 
{
		protected String adresse;
		protected String nom;

		public String getAdresse()
		{
			return adresse;   
		}

		public void SetAdresse(String adress)
		{
			this.adresse = adress;   
		}

		public String getNom()
		{
			return nom;
		}

		public void SetNom(String nom)
		{
			this.nom = nom;   
		}
//La classe Bâtiment doit disposer de deux constructeurs : Sans paramètre , Avec paramètre.
//La classe Bâtiment doit contenir des accesseurs et des modificateurs pour atteindre les différents attributs.

    public Batiment()
    {
    }

    public Batiment(String adresse, String nom) 
    {
    	this.adresse = adresse;
    	this.nom = nom;
    }

//La classe Bâtiment doit contenir une méthode toString () donnant une représentation du Bâtiment.

	public String toString() 
	{
		return "Batiment [adresse=" + adresse + ", nom=" + nom + "]";
	}

}
//Écrire une classe Maison héritant de Bâtiment qui dispose :
//D’un attribut nbrePieces: Le nombre de pièces de la maison.
//De deux constructeurs (avec et sans paramètres)
//La classe Maison doit contenir des getters et des setters pour les différents attributs.


class Maison extends Batiment
{
    private int nbPiece;

    public int getNbPiece()
    {
        return nbPiece;
    }

    public void SetNbPiece(int nbPiece)
    {
        this.nbPiece = nbPiece;
    }

    public Maison(String adress, String Nom, int nbPiece)
	{
		this.adresse = adress;
		this.nom = Nom;
    	this.nbPiece = nbPiece;
	}

    public Maison() 
    {
    	super();
    }

//La classe Maison doit contenir une méthode toString () donnant une représentation de la Maison.

    public String toString() 
	{
		return "Maison [nbPiece=" + nbPiece + "]";
	}
}


