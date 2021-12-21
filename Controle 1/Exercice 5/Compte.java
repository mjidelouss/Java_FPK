// Définir la classe Compte.

public class Compte 
{
    int code;
    float solde;
    static int nbComptes = 0;

    public Compte(float s)
    {
        solde = s;
        ++nbComptes;
        code = nbComptes;
    }

    public Compte()
    {
        this(0);
    }

    public void deposer(float mt)
    {
        solde = solde + mt;
    }

    public void retirer(float mt)
    {
        solde -= mt;
    }

    public String toString()
    {
        return ("code = "+ code + "Solde =" + solde);
    }
}

// Définir la classe CompteEpargne.

class CompteEpargne extends Compte 
{
    float taux = 5;
    public CompteEpargne(float s)
    {
        super(s);
     }

    public CompteEpargne()
    {
        super(0);
    }

    public void calculInteret()
    {
        solde = solde * (1 + taux / 100);
    }

    public String toString()
    {
        return "Compte Epargne" + super.toString() + " taux = " + taux;
    }
}

// Définir la classe ComptePayant.

class ComptePayant extends Compte {
    public ComptePayant(float s)
    {
        super(s);
    }

    public ComptePayant()
    {
        super(0);
    }

    public void deposer(float mt)
    {
        super.deposer(mt);
        super.retirer(20);
    }

    public void retirer(float mt)
    {
        super.retirer(mt);
        super.retirer(20);
    }

    public String toString()
    {
        return "Compte Payant" + super.toString();
    }

}
