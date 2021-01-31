package edu.cgcc.cs161;

//HEADER
//Program Name: Assignment 4
//Author: Grayson Cordie
//Class: CS161 Winter 2021
//Date: 1/31/2020
//Description: Prints 1-10 but excludes 4 and 7 using a continue.

public class Problem2 {
	
	/*PSUEDOCODE
	 * Begin
	 * (Loop) For initialized variable a which is 1, if a is less than or = to 10; add 1 to a.
	 * If a is equal to 4 or 7: continue (skip remaining code and loop back).
	 * Print value a.
	 * End
	 */

	public static void main(String[] args) {

		for(int a = 1; a <= 10; a++) {
			
			if(a == 4 || a == 7) {
				continue;
			}
			
			System.out.print(a + " ");
		}
		
	}

}

/*FOOTER
 * 1 2 3 5 6 8 9 10 
*/