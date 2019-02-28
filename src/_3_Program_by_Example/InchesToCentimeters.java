/**
 * 
 */
package _3_Program_by_Example;

/**
 * @author ABWAR
 *
 */

import acm.program.*;

public class InchesToCentimeters extends ConsoleProgram {
	
	public void run() {
		println("This program converts inches to centimeters.");
		double inches = readDouble("Enter value in inches: ");
		double cm = inches * CENTIMETERS_PER_INCH;
		println(inches + " in " + cm + "cm");
	}
	
	private static final double CENTIMETERS_PER_INCH = 2.54;
	
}
