package level0;

import javax.swing.JOptionPane;

public class number {
	public static void main(String[] args) {
		String six = JOptionPane.showInputDialog(null, "type in 1 number");
		String five = JOptionPane.showInputDialog("put in another number");
		String seven = JOptionPane.showInputDialog("put in another number");
		int n1 = Integer.parseInt(six);
		int n2 = Integer.parseInt(five);
		int n3 = Integer.parseInt(seven);
		{
			if (n1 < n2 && n1 < n3) {
				System.out.println(n1 + "," + n2 + "," + n3);

			} else if (n2 < n1 && n2 < n3) {
				System.out.println(n2 + "," + n1 + "," + n3);

			} else if (n3 < n1 && n3 < n2) {
				System.out.println(n3 + "," + n1 + "," + n2);

			}
		}
	}

}