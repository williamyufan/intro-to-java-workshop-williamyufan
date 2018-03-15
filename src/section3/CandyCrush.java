package section3;

import javax.swing.JOptionPane;

public class CandyCrush { 

	public static void main(String[] args) {
		String donald=JOptionPane.showInputDialog(null, "who you don't like");

		
		JOptionPane.showMessageDialog(null, "You totally have a crush on your mom!");
		String donald2=JOptionPane.showInputDialog(null, donald);
		JOptionPane.showMessageDialog(null, donald2);
		String donaldq=JOptionPane.showInputDialog(null, "who you hate the most");
		JOptionPane.showMessageDialog(null, donaldq+"you are cool");
		

	} 
}



