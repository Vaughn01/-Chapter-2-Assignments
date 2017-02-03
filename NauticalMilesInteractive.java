/**
 * 
 */
package chapter2Exercises;

import java.util.Scanner;

/**
 * @author TV111790
 *
 */
public class NauticalMilesInteractive {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Double kilometersToNauticalMile = 1.852;
		Double milesToNauticalMile = 1.150779;
		Double kilometerShow;
		Double mileShow;
		Double nauticalMiles;
		
		Scanner Input = new Scanner(System.in);
		System.out.print("How many nautical miles would you like to convert?");
		nauticalMiles = Input.nextDouble();
		
		kilometerShow = (nauticalMiles / kilometersToNauticalMile);
		mileShow = (nauticalMiles / milesToNauticalMile);
		
		System.out.println(" In order to have " + nauticalMiles + " miles you will need either " + kilometerShow 
				+ " kilometer, or you will need " + mileShow + " miles.");	

	}

}
