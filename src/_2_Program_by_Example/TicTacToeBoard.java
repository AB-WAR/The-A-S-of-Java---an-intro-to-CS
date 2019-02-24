/**
 * 
 */
package _2_Program_by_Example;

/**
 * @author ABWAR
 *
 */

import acm.graphics.*;
import acm.program.*;

public class TicTacToeBoard extends GraphicsProgram {
	
	public void run() {
		add(new GLine(30, 60, 120, 60));
		add(new GLine(30, 90, 120, 90));
		add(new GLine(60, 30, 60, 120));
		add(new GLine(90, 30, 90, 120));
	}

}
