/**
 * 
 */
package _4_Program_by_Example;

/**
 * @author ABWAR
 *
 */

import acm.program.*;

public class Countdown extends ConsoleProgram {
	
	public void run() {
		for (int t = START; t >= 0; t--) { 
			println(t); 
		} 
		println("Liftoff!");
	}
	
	/* Specifies the value from which to start counting down */ 
	private static final int START = 10;
}
