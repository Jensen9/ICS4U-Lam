/**
 * Name: Jensen Sung
 * Date: 09/08/2022
 * Description: This programs prompts the user to input an integer and finds the power of two whos value is closest to the integer
 */

import java.util.Scanner;

public class LeastTwoPower {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int userInteger = in.nextInt();
		int powerOfTwo  = 0;
		
		while (Math.pow(2,powerOfTwo) < userInteger) {
			powerOfTwo++;
		}
		
		if((Math.pow(2, powerOfTwo) - userInteger) < (userInteger - Math.pow(2, powerOfTwo-1))) {
			System.out.println("2 to the power of " + powerOfTwo + " is the smallest power of two closest to the number.");
		}
		else {
			System.out.println("2 to the power of " + (powerOfTwo - 1) + " is the smallest power of two closest to the number.");
		}
	}
}
