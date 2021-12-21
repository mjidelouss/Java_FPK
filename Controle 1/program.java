import java.util.*;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;

//Programe de test du Exercice 1

public class program {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Employe p1, p2;
		
		p1 = new Employe(5041, "Elousse", "Abdelmajid", new Date("31/12/2001"), new Date("1/1/2021"), 20000);
		p1.AugmentationDuSalaire();
		p1.AfficherEmploye();
		
	
		p2 = new Employe(4621, "Elousse", "Anass", new Date("20/6/1997"), new Date("5/9/2019"), 30000);
		p2.AugmentationDuSalaire();
		System.out.println("************");
		p2.AfficherEmploye();
		
	}

}

//Programe de test du Exercice 2

public class program {

	public static void main(String[] args) {
		Point pt1, pt2;
		
		pt1 = new Point("X", 3, 0, 1);
		pt2 = new Point("Y", 1, 2, 0);
		
		pt1.affiche();
		pt2.affiche();
		
		pt1.translate(1, 1, 2);
		pt2.translate(2, 3, 1);
		
		pt1.affiche();
		pt2.affiche();
		System.out.println("La distence entre les deux points : " + new DecimalFormat("0.00").format(pt1.distance(pt2)));
	}

}

//Programe de test du Exercice 3

public class program {

	public static void main(String[] args) {
		Auteur auteur  = new Auteur("Elousse", "Abdelmajid", 20);
		Auteur[] auteurs = new Auteur[2];
		
		auteurs[0] = new Auteur();
		auteurs[1] = new Auteur();
		
		auteurs[0].setNom("ELOUSSE");
		auteurs[0].setPrenom("Abdelmajid");
		auteurs[0].setAge(20);
		
		auteurs[1].setNom("Ali");
		auteurs[1].setPrenom("Mohamed");
		auteurs[1].setAge(50);
		

		
		@SuppressWarnings("deprecation")
		Livre livre = new Livre(1, "La Nature du l'humain", auteurs, new Date("23/6/2019"), "BELLA");
		
		System.out.println(livre.toString());
		System.out.println(livre.chercherAuteur(auteur));
		System.out.println(livre.chercherTheme("edd"));
	}

}

// Programe de test du Exercice 4

public class program {

	public static void main(String[] args) {
	        Batiment B = new Batiment("zitouna", "salam");
	        System.out.println(B);
	        Maison M1 = new Maison(4);
	        System.out.println(M1);
	        System.out.println(M1.toString());
	}

}

// Programe de test du Exercice 5

public class program {

    public static void main(String[] args) {
        Compte c1 = new Compte(8000);
        CompteEpargne c2 = new CompteEpargne(80000);
        ComptePayant c3 = new ComptePayant();
       
        c1.deposer(10000);
        c1.retirer(6000);
        System.out.println(c1.toString());
        c2.deposer(4500);
        c2.retirer(3000);
        System.out.println(c2);
        c2.calculInteret();
        System.out.println(c2);
        c3.deposer(3000);
        System.out.println(c3.toString());
    }
}
