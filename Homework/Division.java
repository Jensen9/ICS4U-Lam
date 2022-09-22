/**
 * Name: Jensen Sung
 * Date: 09/21/2022
 * Description: Gets user input for numerator and denominator and finds quotient. If denominator is 0 or wrong input type, it lets user know
 */

import java.io.*;
import java.util.*;

public class Division {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numerator = 0, denominator = 0;
		boolean quit = false;
		while(!quit) {
			try {
				System.out.print("Enter the numerator: ");
				numerator = in.nextInt();
				System.out.print("Enter the denominator: ");
				denominator = in.nextInt();

				System.out.println(numerator + " / " + denominator + " is " + (numerator/denominator));
				quit = true;
			}
			catch(ArithmeticException ae) {
				System.out.println("You can't divide " + numerator + " by " + denominator + "\n");
				in.nextLine();
			}
			catch(InputMismatchException ime) {
				String value = in.nextLine();

				if(value.charAt(0) == 'q' || value.charAt(0) == 'Q') {
					quit = true;
				}
				else {
					System.out.println("You entered bad data.");
					System.out.println("Try again.\n");
				}
			}
		}
	}
}
