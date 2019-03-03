/**
 * 
 */
package _4_Program_by_Example;

/**
 * @author ABWAR
 *
 */

import acm.program.*;

public class AddIntegersList extends ConsoleProgram {
	
	public void run() {
		println("This program adds a list of integers."); 
		println("Enter values, one per line, using " + SENTINEL); 
		println("to signal the end of the list."); 
		int total = 0; 
		int value = readInt(" ? "); 
		while (value != SENTINEL) { 
			total += value; 
			value = readInt(" ? ");
		} 
		println("The total is " + total + ".");
	}
	
	/* Specifies the value of the sentinel */ 
	private static final int SENTINEL = 0;

}
