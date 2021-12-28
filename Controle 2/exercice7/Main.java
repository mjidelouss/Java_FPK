package exercice7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Article[] articles = new Article[4];
		
		articles[0] = new Article(500, 1000, "produit1", "fournisseur.1");
		articles[1] = new Article(500, 1000, "produit2", "fournisseur.2");
		articles[2] = new Article(500, 1000, "produit3", "fournisseur.3");
		articles[3] = new Article(500, 1000, "produit4", "fournisseur.4");
		
		List<Article> stockArticles = new ArrayList<Article>();
		stockArticles.add(articles[0]);
		stockArticles.add(articles[1]);
		stockArticles.add(articles[2]);
		stockArticles.add(articles[3]);
		
		Map<String, Double> stock = new HashMap<>();
		
		stock.put(articles[0].getNomProduit(), Double.valueOf(10));
		stock.put(articles[1].getNomProduit(), Double.valueOf(20));
		stock.put(articles[2].getNomProduit(), Double.valueOf(40));
		stock.put(articles[3].getNomProduit(), Double.valueOf(30));
		
		Magasin magasin = new Magasin(stock, stockArticles, stockArticles);
		
		magasin.vendreArticle("produit1", Double.valueOf(80));
		magasin.vendreArticle("produit1", Double.valueOf(10));
		
	}

}