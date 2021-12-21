
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
//La classe B�timent doit disposer de deux constructeurs : Sans param�tre , Avec param�tre.
//La classe B�timent doit contenir des accesseurs et des modificateurs pour atteindre les diff�rents attributs.

    public Batiment()
    {
    }

    public Batiment(String adresse, String nom) 
    {
    	this.adresse = adresse;
    	this.nom = nom;
    }

//La classe B�timent doit contenir une m�thode toString () donnant une repr�sentation du B�timent.

	public String toString() 
	{
		return "Batiment [adresse=" + adresse + ", nom=" + nom + "]";
	}

}
//�crire une classe Maison h�ritant de B�timent qui dispose :
//D�un attribut nbrePieces: Le nombre de pi�ces de la maison.
//De deux constructeurs (avec et sans param�tres)
//La classe Maison doit contenir des getters et des setters pour les diff�rents attributs.


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

//La classe Maison doit contenir une m�thode toString () donnant une repr�sentation de la Maison.

    public String toString() 
	{
		return "Maison [nbPiece=" + nbPiece + "]";
	}
}


