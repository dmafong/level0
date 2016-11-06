package level0;

import java.nio.channels.ShutdownChannelGroupException;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyledEditorKit.ForegroundAction;

// Copyright Wintriss Technical Schools 2013
public class hig {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.

		int random = new Random().nextInt(99) + 1;
		// 2. Print out the random variable above
//		System.out.println(random);

		// 11. do the following 10 times
		for (int i = 0; i < 10; i++) {
			// 1. ask the user for a guess using a pop-up window, and save their response

			String answer = JOptionPane.showInputDialog("guess a random number");

			// 4. convert the users’ answer to an (Integer.parseInt(string))
			int anything = Integer.parseInt(answer);
			// 5. if the guess is correct
			if (anything == random) {
				JOptionPane.showMessageDialog(null, "you win!");
				System.exit(0);

			}
			// 6. win
			// 7. if the guess is high
			if (anything > random) {
				JOptionPane.showMessageDialog(null, "your guess is too high");
			}
			// 8. tell them it's too high
			// 9. if the guess is low
			if (anything < random) {
				JOptionPane.showMessageDialog(null, "your guess is too low");
			}
			// 10. tell them it's too low

			// 12. tell them they lose

		}
		JOptionPane.showMessageDialog(null, "you lose");

	}
}
