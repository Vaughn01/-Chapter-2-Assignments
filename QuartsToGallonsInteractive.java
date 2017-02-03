/**
 * 
 */
package chapter2Exercises;
import javax.swing.JOptionPane;

public class QuartsToGallonsInteractive {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String answer;
		int quartsInGallon = 4;
		int quartsNeeded;
		int gallonShow;
		int quartShow;
		
		answer = JOptionPane.showInputDialog(null, "How many quarts are required for the job?" );
		quartsNeeded = Integer.parseInt(answer);
		gallonShow = quartsNeeded / quartsInGallon;
		quartShow = quartsNeeded % quartsInGallon;
		
		JOptionPane.showMessageDialog(null, "You asked for " + quartsNeeded + " gallons and there are 4 gallons in a gallon. So you have " 
		+ gallonShow + " gallons and " + quartShow + " quarts. ");
		
	}

}
