/**
 * Name: Jensen Sung
 * Date: 09/20/2022
 * Description: Reads from numbers.txt and finds the sum of all numbers separated by line
 */

import java.io.*;

public class AddNumbers
{
	public static void main(String[] args) {
	    double sum = 0;
		try {
		    BufferedReader read = new BufferedReader(new FileReader("numbers.txt"));
		    String line = "";
		    while((line = read.readLine()) != null) {
		        sum += Double.valueOf(line);
		    }
		}
		catch(IOException e) {
		    e.printStackTrace();
		}
		
		System.out.println("The sum of the numbers is " + sum);
	}
}
