package exercice3;

public class Ville {

	String nom ; 
	double population ;
	String pays ; 
	
	public Ville(String nom, double population, String pays) {
		
		this.nom = nom;
		this.population = population;
		this.pays = pays;
	}

	public static void main (String[] args) {
		Ville v1 = new Ville ("OuedZem" , -300000 , "Maroc") ; 
		Exception PopulationException = new Exception ("La populationn doit etre un nombre positif") ;
		try {
			if(v1.population<0 ) {
				throw(PopulationException) ; 	
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage()) ;
		}
	}

}