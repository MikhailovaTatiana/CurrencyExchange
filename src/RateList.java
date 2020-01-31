import java.util.*;
import javax.swing.*;

/**
 * Project HT_19
 * @version 2019-11-27
 * @author Tatiana Mikhailova
 */
public class RateList {
	
	public int x;
	
	List <Map <String, Double>> listOfRates = List.of(new LinkedHashMap<String, Double>(),
													  new LinkedHashMap<String, Double>(),
													  new LinkedHashMap<String, Double>(),
													  new LinkedHashMap<String, Double>());
		
	public Map <String, Double> rateList() {
		
		listOfRates.get(0).put("SEK", 1.000);
		listOfRates.get(0).put("EUR", 0.094);
		listOfRates.get(0).put("USD", 0.103);
		listOfRates.get(0).put("RUB", 6.604);
		
		listOfRates.get(1).put("EUR", 1.00);
		listOfRates.get(1).put("SEK", 10.667);
		listOfRates.get(1).put("USD", 1.102);
		listOfRates.get(1).put("RUB", 70.449);
					
		listOfRates.get(2).put("USD", 1.00);
		listOfRates.get(2).put("SEK", 9.680);
		listOfRates.get(2).put("EUR", 0.907);
		listOfRates.get(2).put("RUB", 63.928);
		
		listOfRates.get(3).put("RUB", 1.00);
		listOfRates.get(3).put("SEK", 0.151);
		listOfRates.get(3).put("EUR", 0.014);
		listOfRates.get(3).put("USD", 0.016);
		
		Map <String, Double> numMap = new LinkedHashMap <String, Double>();
		
		try {
			
			numMap = listOfRates.get(x - 1);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "Uträkningar misslyckades!\nFel input!");
		}
		
		return numMap;
		
	}	
}
