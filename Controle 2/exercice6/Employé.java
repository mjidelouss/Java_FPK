package exercice6;
import java.util.Date ; 


public abstract class Employe {
	
	private int matricule ; 
	private String nom ;
	private String prenom ;
	private Date date_naissance ;

	public Employe(int matricule, String nom, String prenom, Date date_naissance) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissance = date_naissance;
	
	}
	
	public Employe() {	
	}

	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}

	public abstract double getSalaire();

	public String toString() {
		return "Employe [matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", date_naissance="
				+ date_naissance +  "]";
	} 
}
