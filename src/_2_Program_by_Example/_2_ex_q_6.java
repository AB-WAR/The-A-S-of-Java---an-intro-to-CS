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
import java.awt.Color;

public class _2_ex_q_6 extends GraphicsProgram {
	
	public void run() {
		
		/*
		 * Calculate coordinates using mensuration and algebra
		 */
		
		GOval outer = new GOval(140, 140, 150, 150);
		outer.setColor(Color.RED);
		outer.setFilled(true);
		add(outer);
		
		GOval inner = new GOval(170, 170, 90, 90);;
		inner.setColor(Color.WHITE);
		inner.setFilled(true);
		add(inner);
		
		GOval innermost = new GOval(200, 200, 30, 30);
		innermost.setColor(Color.RED);
		innermost.setFilled(true);
		add(innermost);		
	}

}
