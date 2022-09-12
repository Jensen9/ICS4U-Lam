/**
 * Name: Jensen Sung
 * Date: 09/12/2022
 * Description: This program reverses an array of integers by reversing the values into another array and reversing the array of integers itself
 */

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int arrayOfInts[] = new int[14];
		int reversedArrayOfInts[] = new int[14];
		
		for(int i = 0; i < arrayOfInts.length; i++) {
			System.out.print("Enter the value of integer #" + (i+1) + ": ");
			arrayOfInts[i] = in.nextInt();
		}
		System.out.println("Original String: " + Arrays.toString(arrayOfInts));
		
		// Method one
		int counter = arrayOfInts.length - 1;
		
		for(int i = 0; i < arrayOfInts.length; i++) {
			reversedArrayOfInts[counter] = arrayOfInts[i];
			counter--;
		}
		System.out.println("Reversed Array Method 1: " + Arrays.toString(reversedArrayOfInts));

		// Method two
		
		for(int i = 0; i < arrayOfInts.length / 2; i++) {
			int tempStorage = arrayOfInts[i];
			arrayOfInts[i] = arrayOfInts[arrayOfInts.length - 1 - i];
			arrayOfInts[arrayOfInts.length - 1 - i] = tempStorage;
		}
		
		System.out.println("Reversed Array Method 2: " + Arrays.toString(arrayOfInts));
	}
}
