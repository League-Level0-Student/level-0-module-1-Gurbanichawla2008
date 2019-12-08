//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _08_robot_in_space;

import java.applet.AudioClip;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

import javax.swing.JApplet;

import org.jointheleague.graphical.robot.Robot;

public class RobotInSpace implements KeyEventDispatcher {

	Robot bani = new Robot("bani");

	/*
	 * Make the Robot move around the screen when the arrow keys are pressed... 1.
	 * IMPORTANT: For this recipe, use rob.microMove(distance) to move your Robot
	 * and rob.setAngle(angle) to change the direction of your Robot. //Do not add
	 * code here - go to step 2
	 */
	private void moveRobot(int keyPressed) throws InterruptedException {
		// 2. Print out the keyPressed variable and write down the numbers for
		// each arrow key
		System.out.println(keyPressed);

		// 3. If the up arrow is pressed, move the Robot up the screen.
		if (keyPressed == 38) {

			bani.setAngle(0);
			bani.microMove(1);

		}
		// 4. If the down arrow is pressed, move the Robot down.
		if (keyPressed == 40) {
			bani.setAngle(180);
			bani.microMove(1);
		}

		// 5. If the left arrow is pressed, make the Robot go left.
		if (keyPressed == 39) {

			bani.setAngle(90);
			bani.microMove(1);

		}

		// 6. If right is pressed, move the Robot right.
		if (keyPressed == 37) {
			bani.setAngle(-90);
			bani.microMove(1);

		}
	}
	// 7. Run your program and move the Robot to RD-2D for a surprise!

	private void checkIfR2D2Found() throws Exception {
		int robotLocationX = bani.getX();
		int robotLocationY = bani.getY();

		if (robotLocationX <= 7300 && robotLocationX >= 720 && robotLocationY >= 150 && robotLocationY <= 160)
			playEureka();
	}

	public static void main(String[] args) {
		new RobotInSpace().controlTheRobot();
	}

	private void controlTheRobot() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		Robot.setWindowImage("planet.jpg");
		bani.setRandomPenColor();
		bani.penDown();
		bani.setSpeed(20);
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			try {
				moveRobot(e.getKeyCode());
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				checkIfR2D2Found();
			} catch (Exception exception) {
			}
		}
		return false;
	}

	public void playEureka() {
		System.out.println("EUREKA!");
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource("r2d2-eureka.wav"));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
