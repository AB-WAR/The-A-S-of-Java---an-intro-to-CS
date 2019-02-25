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

public class _2_ex_q_8 extends GraphicsProgram {
	
	public void run() {
		
		/*
		 * Calculate coordinates using mensuration and algebra
		 */
		
		GOval top_left = new GOval(160, 100, 150, 150);
		top_left.setColor(Color.BLUE);
		top_left.setFilled(true);
		add(top_left);
		
		GOval top_left_inner = new GOval(170, 110, 130, 130);
		top_left_inner.setColor(Color.WHITE);
		top_left_inner.setFilled(true);
		add(top_left_inner);
		
		GOval top_middle = new GOval(330, 100, 150, 150);
		top_middle.setColor(Color.YELLOW);
		top_middle.setFilled(true);
		add(top_middle);
		
		GOval top_middle_inner = new GOval(340, 110, 130, 130);
		top_middle_inner.setColor(Color.WHITE);
		top_middle_inner.setFilled(true);
		add(top_middle_inner);
		
		GOval top_right = new GOval(500, 100, 150, 150);
		top_right.setColor(Color.BLACK);
		top_right.setFilled(true);
		add(top_right);
		
		GOval top_right_inner = new GOval(510, 110, 130, 130);
		top_right_inner.setColor(Color.WHITE);
		top_right_inner.setFilled(true);
		add(top_right_inner);
		
		GOval bottom_left = new GOval(245, 200, 150, 150);
		bottom_left.setColor(Color.GREEN);
		bottom_left.setFilled(true);
		add(bottom_left);
		
		GOval bottom_left_inner = new GOval(255, 210, 130, 130);
		bottom_left_inner.setColor(Color.WHITE);
		bottom_left_inner.setFilled(true);
		add(bottom_left_inner);
		
		GOval bottom_right = new GOval(415, 200, 150, 150);
		bottom_right.setColor(Color.RED);
		bottom_right.setFilled(true);
		add(bottom_right);
		
		GOval bottom_right_inner = new GOval(425, 210, 130, 130);
		bottom_right_inner.setColor(Color.WHITE);
		bottom_right_inner.setFilled(true);
		add(bottom_right_inner);
	}

}
