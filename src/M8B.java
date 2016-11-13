
// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class M8B {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {

		// 2. Make a variable that will hold a random number and put a random
		// number
		// into this variable using "new Random().nextInt(4)"
		int random = new Random().nextInt(4);
		// 3. Print out this variable
		System.out.println(random);

		// 4. Get the user to enter a question for the 8 ball
		JOptionPane.showInputDialog(null, "enter a question for the magic 8 ball");

		// 5. If the random number is 0
		if (random == 0)

		{

			// -- tell the user "Yes"
			JOptionPane.showMessageDialog(null, "yes");

			// 6. If the random number is 1
		} else if (random == 1)

		{

			// -- tell the user "No"
			JOptionPane.showMessageDialog(null, "No");

			// 7. If the random number is 2
		} else if (random == 2)
			// -- tell the user "Maybe you should ask Google?"
			JOptionPane.showMessageDialog(null, "maybe yiou should ask google");
		// 8. If the random number is 3
		else if (random == 3)
			// -- write your own answer
			JOptionPane.showMessageDialog(null, "probably not");
		else if (random == 4)
			JOptionPane.showMessageDialog(null, "probably ");
		else if (random == 5)
			JOptionPane.showMessageDialog(null, "maybe you should poop");
	}
}
