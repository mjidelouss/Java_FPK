package exercice7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Magasin 
{
	Map<String, Double>		articles;
	List<Article>			articlesVendus;
	List<Article>			articlesStock;
	
	public Magasin() 
	{
		
	}

	public Magasin(Map<String, Double> articles, List<Article> articlesVendus, List<Article> articlesStock) 
	{
		this.articles = articles;
		this.articlesVendus = articlesVendus;
		this.articlesStock = articlesStock;
	}
	
	public void vendreArticle(String nom, Double quantite)
	{
		boolean	trouve;
		int		indice;
		
		trouve = false;
		indice = -1;
		if (this.articles.containsKey(nom))
		{
			for (int i = 0; i < articlesStock.size(); i++)
			{
				if (articlesStock.get(i).getNomProduit().equals(nom))
				{
					trouve = true;
					indice = i;
					break ;
				}
			}
		}
		if (trouve)
		{
			if (this.articles.get(nom) >= quantite)
			{
				this.articlesVendus.add(articlesStock.get(indice));
				this.articles.put(nom, this.articles.get(nom) - quantite);
				System.out.println("vendre Complete!");
			}
			else
				System.out.println("votre monton est " + this.articles.get(nom) + " du " + nom);
		}
		else
			System.out.println("produit introuvable !!");
	}
	
	public void Approvisionner(String nom, Double quantite)
	{
		boolean trouve;
		
		trouve = false;
		for (int i = 0; i < articlesStock.size(); i++)
			if (articlesStock.get(i).getNomProduit().equals(nom))
				trouve = true;
		if (trouve)
			articles.put(nom, quantite);
		else 
			System.out.println("produit introuvable");
	}
}