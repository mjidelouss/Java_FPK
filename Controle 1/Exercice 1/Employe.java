

import java.util.*;


//D�finir une classe Employ� caract�ris�e par les attributs : matricule, nom, pr�nom, date de naissance, date d�embauche et salaire.

public class Employe
 {
     private int matricule;
     private String nom;
     private String prenom;
     private Date datenaissance;
     private Date dateembauche;
     private double salaire;

//D�finir les getters et les setters des diff�rents attributs.

     public int getMatricule()
     {
         return matricule;
     }

     public void SetMatricule(int matricule)
     {
         this.matricule = matricule;
     }   

     public String getNom()
     {
         return nom;
     }
 
     public void SetNom(String nom)
     {
         this.nom = nom;
     }

     public String getPrenom()
     {
         return prenom;
     }
     
     public void SetPrenom(String prenom)
     {
         this.prenom = prenom;
     }

     public Date getDatenaissance()
     {
         return datenaissance;
     }
     
     public void SetDatenaissance(Date datenaissance)
     {
         this.datenaissance = datenaissance;
     }

     public Date getDateembauche()
     {
       return dateembauche;
     }

     public void SetDateembauche(Date dateembauche)
     {
       this.dateembauche = dateembauche;
     }

     public double getSalaire()
     {
         return salaire;
     }

     public void SetSalaire(double salaire)
     {
         this.salaire = salaire;
     }

//D�finir un constructeur sans param�tre et un deuxi�me avec param�tre afin d�initialiser les attributs par des valeurs fournies.

     public Employe()
     {
         
     }

     public Employe(int m, String n, String p, Date bd, Date ed, double s)
     {
         matricule = m;
         nom = n;
         prenom = p;
         datenaissance = bd;
         dateembauche = ed;
         salaire = s;
     }
    
//D�finir une m�thode age qui retourne l��ge de l�employ�.

     @SuppressWarnings("deprecation")
	public int Age()
     {
         Date n = new Date();
         return (n.getYear() + 1900) - (this.datenaissance.getYear() + 1900);
     }

//D�finir une m�thode anciennet�   Qui retourne le nombre d�ann�es d�anciennet� de l�employ�.

     @SuppressWarnings("deprecation")
	public int Anciennete()
     {
    	 Date n = new Date();
         return (n.getYear() + 1900) - (this.dateembauche.getYear() + 1900);
     }

//D�finir une m�thode augmentationDuSalaire  qui augmente le salaire de l�employ� en prenant en consid�ration l�anciennet� :
//{ Si Anciennet� < 5 ans, alors on ajoute 2%   Si Anciennet� < 10 ans, alors on ajoute 5% Sinon, on ajoute 10% }

     public void AugmentationDuSalaire()
     {
         if (Anciennete() < 5)
             salaire += salaire * 0.02;
         else if (Anciennete() < 10)
             salaire += salaire * 0.05;
         else
             salaire += salaire * 0.1;
     }

//D�finir la m�thode afficherEmploy�( ) qui affiche les informations de l�employ�
     
     public void AfficherEmploye()
     {
         System.out.println("\n\nMatricule : " + matricule);
         System.out.println("Nom Complet : " + nom.toUpperCase() + " " + prenom.substring(0, 1).toUpperCase() + prenom.substring(1).toLowerCase());
         System.out.println("Age : " + Age());
         System.out.println("Anciennet� : " + Anciennete());
         System.out.println("Salaire : " + salaire);
     }
}