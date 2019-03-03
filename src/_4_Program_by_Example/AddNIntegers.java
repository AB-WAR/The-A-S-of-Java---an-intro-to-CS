/**
 * 
 */
package _4_Program_by_Example;

/**
 * @author ABWAR
 *
 */

import acm.program.*;

public class AddNIntegers extends ConsoleProgram {
	
	public void run() {
		println("This program adds " + N_VALUES + " integers.");
		int total = 0;
		for(int i = 0; i < N_VALUES; i++) {
			int value = readInt(" ? ");
			total += value;
		}
		println("The total is " + total + ".");
	}
	
	private static final int N_VALUES = 10;
}