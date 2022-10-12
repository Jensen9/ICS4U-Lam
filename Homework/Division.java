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

				System.out.print("Enter the numerator: ");
				denominator = in.nextInt();

				System.out.println(numerator + " / " + denominator + " is " + (numerator/denominator));
				quit = true;

			}
			catch(InputMismatchException IME) {
				if(in.equals("q") || in.equals("q")) {
					quit = true;
				}
				else {
					System.out.println("You entered bad data.");
					System.out.println("Please try again.\n");
					in.nextLine(); // flush scanner
				}
			}
			catch(ArithmeticException ae) {
				System.out.println("You can't divide " + numerator + " by 0\n");
				in.nextLine();
			}
		}

	}

}
