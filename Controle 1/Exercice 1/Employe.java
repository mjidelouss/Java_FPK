

import java.util.*;


//Définir une classe Employé caractérisée par les attributs : matricule, nom, prénom, date de naissance, date d’embauche et salaire.

public class Employe
 {
     private int matricule;
     private String nom;
     private String prenom;
     private Date datenaissance;
     private Date dateembauche;
     private double salaire;

//Définir les getters et les setters des différents attributs.

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

//Définir un constructeur sans paramètre et un deuxième avec paramètre afin d’initialiser les attributs par des valeurs fournies.

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
    
//Définir une méthode age qui retourne l’âge de l’employé.

     @SuppressWarnings("deprecation")
	public int Age()
     {
         Date n = new Date();
         return (n.getYear() + 1900) - (this.datenaissance.getYear() + 1900);
     }

//Définir une méthode ancienneté   Qui retourne le nombre d’années d’ancienneté de l’employé.

     @SuppressWarnings("deprecation")
	public int Anciennete()
     {
    	 Date n = new Date();
         return (n.getYear() + 1900) - (this.dateembauche.getYear() + 1900);
     }

//Définir une méthode augmentationDuSalaire  qui augmente le salaire de l’employé en prenant en considération l’ancienneté :
//{ Si Ancienneté < 5 ans, alors on ajoute 2%   Si Ancienneté < 10 ans, alors on ajoute 5% Sinon, on ajoute 10% }

     public void AugmentationDuSalaire()
     {
         if (Anciennete() < 5)
             salaire += salaire * 0.02;
         else if (Anciennete() < 10)
             salaire += salaire * 0.05;
         else
             salaire += salaire * 0.1;
     }

//Définir la méthode afficherEmployé( ) qui affiche les informations de l’employé
     
     public void AfficherEmploye()
     {
         System.out.println("\n\nMatricule : " + matricule);
         System.out.println("Nom Complet : " + nom.toUpperCase() + " " + prenom.substring(0, 1).toUpperCase() + prenom.substring(1).toLowerCase());
         System.out.println("Age : " + Age());
         System.out.println("Ancienneté : " + Anciennete());
         System.out.println("Salaire : " + salaire);
     }
}