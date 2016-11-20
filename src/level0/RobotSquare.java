package level0;

import org.jointheleague.graphical.robot.Robot;

public class RobotSquare {
	public static void main(String[] args) throws Exception {
		// 1. Make a new Robot
		Robot D = new Robot();

		// 3. Put the robot's pen down
		D.penDown();

		// 6. Make the robot move as fast as possible
		D.setSpeed(100);

		// 5. Do everything below here 4 times
		for (int i = 0; i < 16; i++) {

			// 2. Move your robot 200 pixels
			D.move(200);

			// 4. Turn the robot 90 degrees to the right (90 degrees)
			D.turn(15);

		}
	}
}
