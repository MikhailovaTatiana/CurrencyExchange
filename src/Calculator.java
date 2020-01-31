import java.util.*;

/**
 * Projektarbete HT_19
 * @version 2019-11-27
 * @author Tatiana Mikhailova
 */
public class Calculator {

	public double y;
	public Map <String, Double> i;
	
	@Override
	public String toString() {
		
		String converting0 = "";
		
		StringBuilder converting1 = new StringBuilder(converting0);
		
		for (String j : i.keySet()) {
			converting0 = String.format(j + ": %.2f%n", i.get(j) * y);
			converting1 = converting1.append(converting0);
		}
			
		String converting = new String(converting1);
		
		return converting;
		
	}
}
