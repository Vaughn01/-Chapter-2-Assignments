/**
 * 
 */
package chapter2Exercises;

import javax.swing.JOptionPane;

public class Eggs {

	
	public static void main(String[] args) 
	{
		String Answers;
		double dozenEggsCost = 3.25;
		int dozenEggs = 12;
		double indEggsCost = .45;
		int remainderEgg;
		int numberOfDozenEggs;
		int totalOfEggsOrdered;
		double totalCost;
		
		Answers = JOptionPane.showInputDialog(null, "How many eggs would you like Senor o Senora");
		totalOfEggsOrdered = Integer.parseInt(Answers);
		
		numberOfDozenEggs = totalOfEggsOrdered / dozenEggs;
		remainderEgg = totalOfEggsOrdered % dozenEggs;
		
		totalCost = (numberOfDozenEggs * dozenEggsCost) + (remainderEgg * indEggsCost);
		
		JOptionPane.showMessageDialog(null, "You ordered " + totalOfEggsOrdered + " eggs. Thats $" + dozenEggsCost + " per dozen and $" 
				+ indEggsCost + " per loose egg. That is a total of $" + totalCost);
	
	}

}
