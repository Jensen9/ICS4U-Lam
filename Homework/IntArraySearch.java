/**
 * Name: Jensen Sung
 * Date: 09/26/2022
 * Description: creates an array of 20 integers and fills it with random numbers.
 * Prompts user to enter a number, then searches, using the sequential search algorithm,
 * for the number and outputs its position or indicates if the number is not present 
 * in the array. 
 */

import java.util.Scanner;

public class IntArraySearch {
	public static int intArraySearch(int[] array, int value) {
		for(int i = 0; i < array.length; i++) {
			if(value == array[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// Generating random integer array
		int arrayOfInts[] = new int[20];
		for(int i = 0; i < arrayOfInts.length; i++) {
			arrayOfInts[i] = (int) (Math.random() * 100);
		}
		
		// Getting user input
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer (0-100): ");
		int num = in.nextInt();
		
		// Printing text corresponding to result
		int index = intArraySearch(arrayOfInts, num);
		if(index == -1) {
			System.out.println("Number not found.");
		}
		else {
			System.out.println("Position number: " + index);
		}
	}
}