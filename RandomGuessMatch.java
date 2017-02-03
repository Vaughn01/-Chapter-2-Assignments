/**
 * 
 */
package chapter2Exercises;

import javax.swing.JOptionPane;
/**
 * @author tv111790
 *
 */
public class RandomGuessMatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String guessString;
		int random;
		int guess = 215;
		final int MIN = 1;
		final int MAX = 314;
		boolean isMatch;
		
		random = MIN + (int)(Math.random() * MAX);
		guessString = JOptionPane.showInputDialog(null, "Guess the number I have been thinking between" + MIN + " and " + MAX + " Random guess",
				"", JOptionPane.INFORMATION_MESSAGE);
		
		guess = Integer.parseInt(guessString);
		
		isMatch = guess == random;
		
		JOptionPane.showMessageDialog(null, " Your guess was " + (random - guess) + " numbers away from the random");

		JOptionPane.showMessageDialog(null,  "The number was " + random + ". The result is " + isMatch + ".");

	}

}
