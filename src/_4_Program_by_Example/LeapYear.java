/**
 * 
 */
package _4_Program_by_Example;

/**
 * @author ABWAR
 *
 */

import acm.program.*;

public class LeapYear extends ConsoleProgram {
	
	public void run() {
		println("This program checks for leap years."); 
		int year = readInt("Enter year: "); 
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0); 
		if (isLeapYear) { 
			println(year + " is a leap year."); 
		} else { 
			println(year + " is not a leap year."); 
		}
	}
}
