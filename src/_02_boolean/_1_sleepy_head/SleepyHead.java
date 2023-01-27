package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false.
		// You have already been using booleans in the form of comparisons
		// i.e. >, <, ==, >=, <=, .equals() which all produce a true or false
		// value.
		
	String st =	JOptionPane.showInputDialog(null, "What Day is it");
		
	
	boolean isWeekend =  st.equals("saturday")||st.equals("sunday");
	
	
//		if(st.equals("monday"))
//				{
//		int isWeekend = 1;
//				}
//		else if(st.equals("tuesday"))
//		{
//int isWeekend = 1;
//		}
//		else if(st.equals("wednesday"))
//		{
//int isWeekend = 1;
//		}
//		else if(st.equals("thursday"))
//		{
//int isWeekend = 1;
//		}
//		else if(st.equals("friday"))
//		{
//int isWeekend = 1;
//		}
//		else if(st.equals("saturday"))
//		{
//int isWeekend = 1;
//		}
//		else if(st.equals("sunday"))
//		{
//int isWeekend = 1;
//		}
       
		
		
		// 1.) Run the program and look at the if-else statement below.
		
        // 2.) Change the value of isWeekend so that the pop-up in the
        //     if statement happens instead.
		
        // Notice that when using a boolean variable in an if statement 
		// there is no need for comparisons because it is already a true 
		// or false value.
		
		if(isWeekend) {
			JOptionPane.showMessageDialog(null, "You can sleep in! There's no school today.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Get out of bed and go to school!");
		}

	}
}
