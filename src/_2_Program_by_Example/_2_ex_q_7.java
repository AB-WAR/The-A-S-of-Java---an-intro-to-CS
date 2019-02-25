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
import java.awt.*;

public class _2_ex_q_7 extends GraphicsProgram {
	
	public void run() {
		
		/*
		 * Calculate coordinates using mensuration and algebra
		 */
		
		GOval top_left = new GOval(160, 100, 150, 150);
		top_left.setColor(Color.BLUE);
		top_left.setFilled(false);
		add(top_left);
		
		GOval top_middle = new GOval(330, 100, 150, 150);
		top_middle.setColor(Color.YELLOW);
		top_middle.setFilled(false);
		add(top_middle);
		
		GOval top_right = new GOval(500, 100, 150, 150);
		top_right.setColor(Color.BLACK);
		top_right.setFilled(false);
		add(top_right);
		
		GOval bottom_left = new GOval(245, 210, 150, 150);
		bottom_left.setColor(Color.GREEN);
		bottom_left.setFilled(false);
		add(bottom_left);
		
		GOval bottom_right = new GOval(415, 210, 150, 150);
		bottom_right.setColor(Color.RED);
		bottom_right.setFilled(false);
		add(bottom_right);
	}

}
