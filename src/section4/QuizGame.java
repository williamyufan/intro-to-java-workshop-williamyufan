package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		int scor = 0;

		String input = JOptionPane.showInputDialog("Q: What's 190+198?");
		
		if (input.equalsIgnoreCase("")) {
			 									
input =	JOptionPane.showInputDialog(null, "Q: 190+198. Are you sure you want to Submit?");
		}
		
		if (input.equalsIgnoreCase("388")) {

			JOptionPane.showMessageDialog(null, "You are CORRECT ");

			scor = scor + 1;

			JOptionPane.showMessageDialog(null, "You Score IS " + scor);
		} else {
			JOptionPane.showMessageDialog(null, "You are INCORRECT");
		}

		String input1 = JOptionPane.showInputDialog("What's 190+1978?");
		
		if (input.equalsIgnoreCase("")) {
			
			input =	JOptionPane.showInputDialog(null, "Q: 190+1978. Are you sure you want to Submit?");
					}
		
		
		if (input1.equalsIgnoreCase("2168")) {
			

			JOptionPane.showMessageDialog(null, "You are CORRECT ");

			scor = scor + 1;
			
			JOptionPane.showMessageDialog(null, "You Score IS " + scor);
		}

		
		 else {
			JOptionPane.showMessageDialog(null, "You are INCORRECT");
		}

		String input2 = JOptionPane.showInputDialog("What's 1980.975+188.795?");
		
		if (input.equalsIgnoreCase("")) {
			
			input =	JOptionPane.showInputDialog(null, "Q: 190+1978. Are you sure you want to Submit?");
					}
		
		if (input1.equalsIgnoreCase("2169.77")) {
			

			JOptionPane.showMessageDialog(null, "You are CORRECT ");

			scor = scor + 1;

		}

		else {
			JOptionPane.showMessageDialog(null, "You are INCORRECT");
		}

		JOptionPane.showMessageDialog(null, "You Score IS " + scor);
	}
}