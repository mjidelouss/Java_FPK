package exercice6;
import java.util.Date;

public class Main {

	public static void main (String [] args) {
		
		Associe A1 = new Associe(123 , "Elousse", "Abdelmajid",  new Date(2001 , 06 , 10 ), 60000, 2000000, 20) ;
		Cadre C1 = new Cadre (345, "Elousse", "Ali", new Date(1000 , 05 , 10), 6) ;
		Ouvrier O1 = new Ouvrier(1234,"Elousse", "Younes",  new Date(1997 , 06 , 15),new Date ( 2019 , 15 , 12 ) ) ; 
		System.out.println(A1.getSalaire()) ; 
		System.out.println(C1.getSalaire()) ; 
		System.out.println(O1.getSalaire()) ; 
	}
}
