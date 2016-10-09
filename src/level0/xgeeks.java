package level0;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2014

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class xgeeks {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String Dylan = " laser eye visioin";
		String Kaley = "the force";

		// 2. Ask the user to enter a name. Store their answer in a variable.
		String name = JOptionPane.showInputDialog("enter your name");

		// 3. Show the superpower in a pop-up, depending on the name entered.
		if (name.equals("Dylan")) {
			JOptionPane.showMessageDialog(null, "your superpower is " + Dylan);
		} else if (name.equals("Kaley")) {
			JOptionPane.showMessageDialog(null, "your superpower is " + Kaley);
		} else {
			JOptionPane.showMessageDialog(null, "the name that your put was not recognized, so you have no superpower");
		}
	}
}