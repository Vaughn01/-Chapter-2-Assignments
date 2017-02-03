/**
 * 
 */
package chapter2Exercises;

import java.util.Scanner;


public class QuartsToGallons {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//String strGallons;
				int gallons;
				int num2;
				int num3;
				int num4;
				int answer;
				
				Scanner inputDevice = new Scanner(System.in);
				
				System.out.print("Please enter your first number>>>");
				gallons = inputDevice.nextInt();
				inputDevice.nextLine();
				
				System.out.print("Please enter your first number>>>");
				num2 = inputDevice.nextInt();
				inputDevice.nextLine();
				
				System.out.print("Please enter your first number>>>");
				num3 = inputDevice.nextInt();
				inputDevice.nextLine();
				
				System.out.print("Please enter your first number>>>");
				num4 = inputDevice.nextInt();
				inputDevice.nextLine();
				
				answer = gallons + num2 + num3 + num4;
				System.out.print("The total of all four numbers is = " + answer);
	}

}
