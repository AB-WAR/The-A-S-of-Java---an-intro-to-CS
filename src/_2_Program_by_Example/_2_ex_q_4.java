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

public class _2_ex_q_4 extends GraphicsProgram {
	
	public void run() {
		
		/*
		 * Calculate house coordinates using mensuration and algebra
		 */
		
		GRect body = new GRect(300, 300, 400, 200);
		add(body);
		
		GRect window_1 = new GRect(330, 330, 60, 70);
		GRect window_2 = new GRect(610, 330, 60, 70);
		add(window_1);
		add(window_2);
		
		GRect door = new GRect(450, 380, 100, 120);
		add(door);
		
		GOval lock = new GOval(535, 435, 10, 10);
		add(lock);
		
		GLine left_line = new GLine(300, 300, 500, 250);
		add(left_line);
		
		GLine right_line = new GLine(500, 250, 700, 300);
		add(right_line);
		
	}

}
