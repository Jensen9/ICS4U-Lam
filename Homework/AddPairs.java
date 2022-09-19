/**
 * Name: Jensen Sung
 * Date: 09/15/2022
 * Description: Gets user input for integer and adds each pair of numbers
 */

import java.util.Scanner;

public class AddPairs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		String integer = in.nextLine();
		
		int sum = 0, counter = 0;
		String pair = "";
		for(int i = 0; i < integer.length(); i++) {
			if(counter == 2) {
				sum += Integer.valueOf(pair);
				pair = "";
				counter = 0;
			}
			
			pair += integer.charAt(i);
			counter++;
		}

		if(integer.length() % 2 == 1) {
			sum += integer.charAt(integer.length()-1) - '0';
		}
		
		System.out.println(sum);
	}
}
