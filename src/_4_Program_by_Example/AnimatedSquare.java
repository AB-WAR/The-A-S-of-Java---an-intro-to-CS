/**
 * 
 */
package _4_Program_by_Example;

/**
 * @author ABWAR
 *
 */

import acm.program.*;
import acm.graphics.*;

public class AnimatedSquare extends GraphicsProgram {
	
	public void run() {
		GRect square = new GRect(0, 0, SQUARE_SIZE, SQUARE_SIZE);
		square.setFilled(true);
		add(square);
		double dx = (getWidth() - SQUARE_SIZE) / N_STEPS;
		double dy = (getHeight() - SQUARE_SIZE) / N_STEPS;
		for (int i = 0; i < N_STEPS; i++) {
			square.move(dx, dy);
			pause(PUASE_TIME);
		}
	}

	/* Private Constants */
	private static final int N_STEPS = 1000;
	private static final int PUASE_TIME = 20;
	private static final double SQUARE_SIZE = 50;
	
}
