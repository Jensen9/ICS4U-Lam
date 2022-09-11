/**
 * Name: Jensen Sung
 * Description: This program gets an integer from the user and finds all pythagorean triples whos largest number is below the integer
 * Date: 09/09/2022
 */

import java.util.Scanner;

public class Pythagorean {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int limit = in.nextInt();
		
		// Pythagorean Equation is a² + b² = c² thus the variable names
		for(int c = 0; c <= limit; c++) {
			for(int b = 0; b < c; b++) {
				for(int a = 0; a < b; a++) {
					if(a*a + b*b == c*c) {
						System.out.println(a + " " + b + " " + c);
					}
				}
			}
		}
	}
}
