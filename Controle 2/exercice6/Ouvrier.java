package exercice6;
import java.util.*;

public class Ouvrier extends Employe  {
	
	private Date date_embauche ;
	private final double  SMIG = 3000 ;

	public Ouvrier(int matricule, String nom, String prenom, Date date_naissance, Date date_embauche) {
		super(matricule, nom, prenom, date_naissance);
		this.date_embauche = date_embauche;
	}

	public double getSalaire() {
		
        double salaire;
        Date mt = new Date();
        int Anciennete = mt.getYear() + 1900 - date_embauche.getYear();
    
        if (SMIG + Anciennete * 100 <= 2 * SMIG)
            salaire = SMIG + Anciennete * 100;
        else
            salaire = SMIG * 2;
        return salaire;  
     
	}

	public Date getDate_embauche() {
		return date_embauche;
	}

	public void setDate_embauche(Date date_embauche) {
		this.date_embauche = date_embauche;
	}

	public double getSMIG() {
		return SMIG;
	}
}
