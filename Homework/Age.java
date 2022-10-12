import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter birthyear: ");
		int birthYear = in.nextInt();
		final int CURRENT_YEAR = 2022;
		System.out.println("You are " + (CURRENT_YEAR - birthYear) + " years old");
	}
}