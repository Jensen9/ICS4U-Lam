/**
 * Name: Jensen Sung
 * Date: 09/21/2022
 * Description: This programs reads from input.txt then outputs the sum of each group of numbers
 */

import java.io.*;

public class GroupOfNumbers {

	public static void main(String[] args) {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader("input.txt"));
		}
		catch(IOException e) {
			System.out.println("Cannot open file");
		}

		int sum = 0;
		int num;
		String groupName = null;
		String line = null;
		boolean quit = false;
		while(!quit) {
			try {
				line = in.readLine();
				num = Integer.parseInt(line);
				sum += num;
			}
			catch(NumberFormatException nfe) {
				if(groupName == null) {
					groupName = line;
				}
				else {
					System.out.println(groupName);
					System.out.println("Sum = " + sum);

					if(line == null) {
						quit = true;
					}
					else {
						groupName = line;
						sum = 0;
					}
				}
			}
			catch(IOException e) {
                System.out.println("Cannot read file");
      }
		}
	}
}
