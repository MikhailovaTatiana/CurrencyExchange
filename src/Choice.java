import javax.swing.*;

/**
 * Project HT_19
 * @version 2019-11-27
 * @author Tatiana Mikhailova
 */
public class Choice {

	public int name() {
		
		String currency0 = JOptionPane.showInputDialog("Välj en valuta med siffra: "
												+ "\n1 (SEK), 2 (EUR), 3 (USD) eller 4 (RUB): ");
		int currency = 0;	
		
		try {		
			currency = Integer.parseInt(currency0);
						
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Inget rätt val!");
		}
			
//		}catch (NullPointerException e) {
//			JOptionPane.showMessageDialog(null, "Ingen matningtest!");
//		} catch (NumberFormatException e) {
//			JOptionPane.showMessageDialog(null, "Fel matning!test!");
//		}
					
		return currency;
	}	
		
	public double touch() {
		
		String sum0 = JOptionPane.showInputDialog("Mata in summan: ");
		double sum = 0;
		
		try {
			
			sum = Double.parseDouble(sum0);
		
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Ingen matning!");
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Fel matning!!");
		}
		
		return sum;
	
	}
}
