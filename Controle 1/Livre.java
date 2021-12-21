// une classe Livre (réf, titre, liste des auteurs, année et la maison d’édition).

import java.util.*;

class Auteur
	{
		private String nom;
		private String prenom;
		private int age;
	
		public Auteur()
		{

		}

		public Auteur(String nom, String prenom, int age)
		{
			this.nom = nom;
			this.prenom = prenom;
			this.age = age;
		}

		public String getNom() 
		{
			return nom;
		}

		public void setNom(String nom) 
		{
			this.nom = nom;
		}

		public String getPrenom() 
		{
			return prenom;
		}

		public void setPrenom(String prenom) 
		{
			this.prenom = prenom;
		}

		public int getAge() 
		{
			return age;
		}

		public void setAge(int age) 
	{
			this.age = age;
	}

		public String toString() 
		{
			return "Auteur [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
		}

}

	public class Livre 
	{
		private int ref;
		private String titre;
		private Auteur[] listAuteur;
		private Date annee;
		private String maisonDedition;

		public Livre(int ref, String titre, Auteur[] listAuteur, Date annee, String maisonDedition)
		{
			this.ref = ref;
			this.titre = titre;
			this.listAuteur = listAuteur;
			this.annee = annee;
			this.maisonDedition = maisonDedition;
		}

// Des accesseurs et modificateurs, getter et setter, permettant de gérer les différentes informations du livre.

		public int getRef()
		{
			return ref;
		}

		public void setRef(int ref)
		{
			this.ref = ref;
		}

		public String getTitre()
		{
			return titre;
		}

public void setTitre(String titre)
	{
		this.titre = titre;
	}

	public Auteur[] getListAuteur()
	{
		return listAuteur;
	}

	public void setListAuteur(Auteur[] listAuteur)
	{
		this.listAuteur = listAuteur;
	}

	public Date getAnnee()
	{
		return annee;
	}

	public void setAnnee(Date annee)
	{
		this.annee = annee;
	}

	public String getMaisonDedition()
	{
		return maisonDedition;
	}

	public void setMaisonDedition(String maisonDedition)
	{
		this.maisonDedition = maisonDedition;
	}

// Définir la méthode toString () pour pouvoir afficher les caractéristiques d’un Livre.

	public String toString() 
	{
		return "Livre [ref=" + ref + ", titre=" + titre + ", listAuteur=" + Arrays.toString(listAuteur) + ", annee=" + annee + ", maisonDedition=" + maisonDedition + "]";
	}

// Une fonction boolean, chercherAuteur ( ), permettant de déterminer si le livre est écrit par un auteur donné en paramètre.
	
	boolean chercherAuteur(Auteur auteur)
	{
		for (int i = 0; i < listAuteur.length; i++)
		{
			if (listAuteur[i].equals(auteur))
				return (true);
		}
		return (false);
	}

// Une fonction boolean, chercherTheme ( ).
	
	boolean chercherTheme(String theme)
	{
		if (this.titre.contains(theme))
			return (true);
		return (false);
	}
}
