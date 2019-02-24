/**
 * 
 */
package _2_Program_by_Example;

import java.awt.Color;
import acm.graphics.*;
import acm.program.*;

/**
 * @author ABWAR
 *
 */

public class HelloProgram extends GraphicsProgram {
	public void run() {
		  add(new GLabel("hello, world", 100, 75));
		
		/*
		  GLabel msg = new GLabel("hello, world", 100, 75);
		  msg.setFont("Helvetica-24");
		  msg.setColor(Color.RED);
		  add(msg);
		 */
	}
}
