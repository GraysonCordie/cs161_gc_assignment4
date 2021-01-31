package edu.cgcc.cs161;

//HEADER
//Program Name: Assignment 4
//Author: Grayson Cordie
//Class: CS161 Winter 2021
//Date: 1/31/2020
//Description: Calculates the sum of the first 10 natural numbers using a loop.

public class Problem3 {
	
	/*PSUEDOCODE
	 * Begin
	 * Initialize variable a as 1.
	 * Initialize variable b as 1.
	 * While a is less than or =  to 10:
	 * 	Set b to the result of b + a.
	 * 	Add one to a.
	 * Print value of b.
	 * End
	 */

	public static void main(String[] args) {

		int a = 1;
		int b = 1;
		
		while(a <= 10) {
			
			b = b + a;
			
			a++;
			
		
		}
		
		System.out.println(b);
		
	}

}

/*FOOTER
 * 56
 */
