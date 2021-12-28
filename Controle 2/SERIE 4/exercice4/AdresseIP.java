package exercice4;

public class AdresseIP {
	private int[] octets;
	private String classe;

	public AdresseIP (int o1,int o2, int o3, int o4) {
	Exception nombre_non_valide = new Exception (" Le Nombre doit etre compris ente 0 et 255 ") ;
	try {
		if (o1<0 || o1 >255 || o2<0 || o2 >255 || o3<0 || o3 >255 || o4<0 || o4 >255 ) {
			throw(nombre_non_valide) ; 	
		}
	}
	catch(Exception e) {
		System.out.println(e.getMessage()) ;
	}
	octets = new int[] {o1,o2,o3,o4}; 
	
	}
	public String toString() {
	return octets[0] + "." + octets[1] + "." + octets[2] + "."+ 
	octets[3] ; 
	}
	
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
}