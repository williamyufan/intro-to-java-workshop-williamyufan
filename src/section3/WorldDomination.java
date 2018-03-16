package section3;

import javax.swing.JOptionPane;

public class WorldDomination {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("bob");
		if (input.equalsIgnoreCase("bob")) {

			JOptionPane.showMessageDialog(null, "you have a name");
		}

		else {
			JOptionPane.showMessageDialog(null, "your name is awful");

		}
	}
}
// 2. If they say "yes", tell them they will rule the world.

// 3. Otherwise, wish them good luck washing dishes.
