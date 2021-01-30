package edu.cgcc.cs161;

//HEADER
//Program Name: Assignment 4
//Author: Grayson Cordie
//Class: CS161 Winter 2021
//Date: 1/31/2020
//Description: Prints 1-10 using for, while, and do while loops.

public class Problem1 {
	
	/* PSUEDOCODE
	 * Begin
	 * Display "For loop:"
	 * Within for loop: initialize variable a, check condition on a, add 1 to a if less than 10
	 * 	If a is less than or = to 10, print value of a and loop back
	 * Display "While loop:"
	 * Initialize variable b as 1
	 * While b is less than or = to 10, print b then add 1. loop back.
	 * Display "Do While loop:"
	 * Initialize variable c as 1.
	 * Do: Print c and add 1.
	 * Then check if c is less than or = to 10. Loop back if true.
	 * End
	 */	

	public static void main(String[] args) {
		
		System.out.println("For loop:");
		
		for(int a = 1; a <= 10; a += 1) {
			System.out.println(a);
		}
		
		System.out.println("While loop:");
		
		int b = 1;
				
		while(b <= 10) {
			
			System.out.println(b);
			
			b += 1;
		}
		
		System.out.println("Do While loop:");
		
		int c = 1;
		
		do {
			
			System.out.println(c);
			
			c += 1;
		} while(c <= 10);
		
		

	}

}

/* FOOTER
For loop:
1
2
3
4
5
6
7
8
9
10
While loop:
1
2
3
4
5
6
7
8
9
10
Do While loop:
1
2
3
4
5
6
7
8
9
10 
 */
