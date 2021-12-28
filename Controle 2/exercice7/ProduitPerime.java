package exercice7; 
import java.time.LocalDate;

public interface ProduitPerime {
	public abstract LocalDate datePeremption();
	public abstract int getJoursRestants();
}