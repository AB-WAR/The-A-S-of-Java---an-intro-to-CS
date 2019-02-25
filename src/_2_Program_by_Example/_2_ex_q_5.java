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
import java.awt.color.*;

public class _2_ex_q_5 extends GraphicsProgram {
	
	public void run() {
		
		/*
		 * Calculate coordinates using mensuration and algebra
		 */
		GRect face_outline = new GRect(199, 99, 151,251);
		face_outline.setColor(Color.BLACK);
		face_outline.setFilled(false);
		add(face_outline);
		
		GRect face = new GRect(200, 100, 150,250);
		face.setColor(Color.GRAY);
		face.setFilled(true);
		add(face);
		
		GRect mouth = new GRect(240, 280, 70, 20);
		mouth.setColor(Color.WHITE);
		mouth.setFilled(true);
		add(mouth);
		
		GOval left_eye = new GOval(230, 150, 20, 20);
		left_eye.setColor(Color.ORANGE);
		left_eye.setFilled(true);
		add(left_eye);
		
		GOval right_eye = new GOval(300, 150, 20, 20);
		right_eye.setColor(Color.ORANGE);
		right_eye.setFilled(true);
		add(right_eye);
		
		GRect nose = new GRect(270, 190, 10, 60);
		nose.setColor(Color.BLACK);
		nose.setFilled(true);
		add(nose);
	}

}
