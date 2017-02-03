/**
 * 
 */
package chapter2Exercises;

import java.util.Scanner;

/**
 * @author TV111790
 *
 */
public class InchesToFeetInteractive {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		int inchesToFeet = 12;
		int inchesNeeded;
		int feet;
		int remainderInches;
		
		Scanner Input = new Scanner(System.in);
		
		System.out.print(" How many inches would you like to convert? ");
		inchesNeeded = Input.nextInt();
		
		feet = (inchesNeeded / inchesToFeet);
		remainderInches = (inchesNeeded % inchesToFeet);
		
		System.out.println(" You will need " + feet + " feet with a remainder of " + remainderInches + " inches for " 
		+ inchesNeeded + " inches because there are 12 feet in a foot. ");
		
		
		

	}

}
