import java.util.*;
import javax.swing.*;

/**
 * Project HT_2019
 * @version 2019-11-27
 * @author Tatiana Mikhailova
 */
public class Exchange {
	
	public static void main(String[] args) {
		
		Choice ch1 = new Choice();
		int inputCurrency = ch1.name();
		Choice ch2 = new Choice();
		double inputSum = ch2.touch();
		
		RateList rate = new RateList();
		rate.x = inputCurrency;
		
		Map <String, Double> list = rate.rateList();
		
		Calculator calc = new Calculator();
		calc.y = inputSum;
		calc.i = list;
		
		if ((inputCurrency > 0 && inputCurrency < 5) && (inputSum > 0))
			JOptionPane.showMessageDialog(null, calc);
		
	}
}
