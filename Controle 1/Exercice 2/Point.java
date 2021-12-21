// R�aliser une classe Point permettant de repr�senter un point dans l�espace.

public class Point {
		String nom;
		double x;
		double y;
		double z;

// Un constructeur recevant en arguments le nom et les cordonn�es d�un point
		
public Point(String nom, double x, double y, double z)
{
	this.nom = nom;
	this.x = x;
	this.y = y;
	this.z = z;
}

// Une m�thode affiche ( ) imprimant, en fen�tre console, le nom du point et ses cordonn�es.

public void affiche()
{
	System.out.println("Les Cordonees du Point : " + this.nom + ": ");
	System.out.println("(" + this.x + ", " + this.y + ", " + this.z + ")");
}

// Une m�thode translate ( ) effectuant une translation d�finie par la valeur de ses arguments.

public void translate(double x, double y, double z)
{
	this.x = x;
	this.y = y;
	this.z = z;
}

// Une m�thode distance ( ) calculant la distance entre le point en question et un autre point pass� en param�tre.

double distance(Point autre)
	{
		return (Math.sqrt(Math.pow(this.x - autre.x, 2) + Math.pow(this.y - autre.y, 2) +  Math.pow(this.z - autre.z, 2)));
	}

}