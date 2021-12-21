// Réaliser une classe Point permettant de représenter un point dans l’espace.

public class Point {
		String nom;
		double x;
		double y;
		double z;

// Un constructeur recevant en arguments le nom et les cordonnées d’un point
		
public Point(String nom, double x, double y, double z)
{
	this.nom = nom;
	this.x = x;
	this.y = y;
	this.z = z;
}

// Une méthode affiche ( ) imprimant, en fenêtre console, le nom du point et ses cordonnées.

public void affiche()
{
	System.out.println("Les Cordonees du Point : " + this.nom + ": ");
	System.out.println("(" + this.x + ", " + this.y + ", " + this.z + ")");
}

// Une méthode translate ( ) effectuant une translation définie par la valeur de ses arguments.

public void translate(double x, double y, double z)
{
	this.x = x;
	this.y = y;
	this.z = z;
}

// Une méthode distance ( ) calculant la distance entre le point en question et un autre point passé en paramètre.

double distance(Point autre)
	{
		return (Math.sqrt(Math.pow(this.x - autre.x, 2) + Math.pow(this.y - autre.y, 2) +  Math.pow(this.z - autre.z, 2)));
	}

}