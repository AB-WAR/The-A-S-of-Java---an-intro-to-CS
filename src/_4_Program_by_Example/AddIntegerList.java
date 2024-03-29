/**
 * 
 */
package _4_Program_by_Example;

/**
 * @author ABWAR
 *
 */

import acm.program.*;

public class AddIntegerList extends ConsoleProgram {
	
	public void run( ) {
		println("This program adds a list of integers.");
		println("Enter values, one per line, using " + SENTINEL);
		println("to signal the end of the list.");
		int total = 0;
		while (true) {
			int value = readInt(" ? ");
			if (value == SENTINEL) break;
			total += value;
		}
		println("The total is " + total + ".");
	}
	
	private static final int SENTINEL = 0;

}
