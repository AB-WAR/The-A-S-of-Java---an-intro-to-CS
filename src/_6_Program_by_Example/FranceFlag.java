/**
 * 
 */
package _6_Program_by_Example;

/**
 * @author ABWAR
 *
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class FranceFlag extends GraphicsProgram {
	
	public void run() {
		double width = getWidth();
		double height = getHeight();
		double stripe = width / 3;
		add(new FilledRect(0, 0, stripe, height, Color.BLUE));
		add(new FilledRect(stripe, 0, stripe, height, Color.WHITE));
		add(new FilledRect(2*stripe, 0, stripe, height, Color.RED));
	}

}
