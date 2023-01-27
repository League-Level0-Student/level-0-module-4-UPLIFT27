package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String ni = JOptionPane.showInputDialog(null,"How many nickels do you have");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
int nics = Integer.parseInt(ni);
		// Ask the user how many dimes they have, and convert their answer
String di = JOptionPane.showInputDialog(null,"How many dimes do you have"); 
int dims = Integer.parseInt(di);



		// Ask the user how many quarters they have, and convert their answer

String qi = JOptionPane.showInputDialog(null,"How many quarters do you have"); 
int qims = Integer.parseInt(qi);




		// Calculate how much money the user has.  Hint: Use a double variable 

double total = nics*0.05 + dims*0.1+ qims*0.25;



JOptionPane.showMessageDialog(null, total + " dolars and cents");


		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

