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

public class FilledRect extends GRect {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

/** Creates a new FilledRect with the specified bounds. */
	public FilledRect(double x, double y, double width, double length) {
		super(x, y, width, length);
		setFilled(true);
	}

/** Creates a new FilledRect with the specified bounds and color */
	public FilledRect(double x, double y, double width, double length, Color color) {
		this(x, y, width, length);
		setColor(color);
	}
}