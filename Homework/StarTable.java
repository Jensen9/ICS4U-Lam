/**
 * Name: Jensen Sung
 * Date: 09/19/2022
 * Description: Gets height and length of array and outputs star table to text file
 */
import java.io.*;
import java.util.*;

public class StarTable {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Height of array: ");
		final int HEIGHT = in.nextInt();

		System.out.print("Length of array: ");
		final int LENGTH = in.nextInt();

		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("star.txt"));
			for(int i = 0; i < HEIGHT; i++) {
				for(int j = 0; j < LENGTH; j++) {
					out.write("* ");
				}
				out.newLine();
			}

			out.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
