package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
	Robot bobthebuilder = new Robot();
	bobthebuilder.miniaturize();
	bobthebuilder.sparkle();
	bobthebuilder.setRandomPenColor();
	bobthebuilder.penDown();
	bobthebuilder.setSpeed(1000);
	bobthebuilder.setAngle(220);
	bobthebuilder.move(87);
	bobthebuilder.turn(44);
	bobthebuilder.move(58);
	bobthebuilder.turn(140);
	bobthebuilder.move(190);
	bobthebuilder.turn(45);
	bobthebuilder.move(170);
	bobthebuilder.turn(135);
	bobthebuilder.move(90);
	for(int i=0; i<4; i++) {
		bobthebuilder.move(90);
		bobthebuilder.turn(90);
	}
	
	
	
	
	
	
		
		
	}
}
