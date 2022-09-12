/**
 * Name: Jensen Sung
 * Date: 09/12/2022
 * Description: This program declares and initializes an array based on user input and calculates the sum and prints the even numbers
 */

import java.util.Scanner;

public class Simple1DArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int arraySize = in.nextInt();
		
		int[] arrayOfInts = new int[arraySize];
		int sampleSum = 0;
		
		for(int i = 0; i < arrayOfInts.length; i++) {
				System.out.print("Enter the value of integer #" + (i+1) + ": ");
				arrayOfInts[i] = in.nextInt();
				
				if(arrayOfInts[i] < 0) {
					arrayOfInts[i] *= -1;
				}
				
				sampleSum += arrayOfInts[i];
		}
		
		System.out.print("Even numbers: ");
		for(int i = 0; i < arrayOfInts.length; i++ ) {
			if(arrayOfInts[i] % 2 == 0) {
				System.out.print(arrayOfInts[i] + " ");
			}
		}
		System.out.println("\nSum: " + sampleSum);
	}
}
