package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot rdrd=new Robot();

	
	void go() {
		rdrd.miniaturize();
		rdrd.sparkle();
		rdrd.setSpeed(1000);
		rdrd.setPenWidth(5);
		rdrd.setRandomPenColor();
		for(int i=0; i<4; i++) { 
			rdrd.setRandomPenColor();
			rdrd.turn(90);
		}

			
			 drawSquare();	
			

	}

	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		rdrd.move(100);
		rdrd.turn(90);
		rdrd.move(100);
		rdrd.turn(90);
		rdrd.move(100);
		rdrd.turn(90);
		rdrd.move(100);
		rdrd.turn(90);
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



