import java.util.Scanner;

public class PantryTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Jam jam1 = new Jam("Gooseberry", "7/4/86", 12);
		Jam jam2 = new Jam("Crab Apple", "9/30/99", 8);
		Jam jam3 = new Jam("Rhubarb", "10/31/99", 16);

		Pantry pantry = new Pantry(jam1, jam2, jam3);

		System.out.println("Welcome to the pantry!");
		
		boolean exit = false;
		while(!exit) {
			System.out.println(pantry);
			System.out.println("Enter your selection: (1, 2, or 3): ");
			int jam = in.nextInt();
			if(jam == -1) {
				exit = true;
				System.out.println("Goodbye!");
			}
			else if(jam > 3) {
				System.out.println("Jam does not exist!");
			}
			else {
				System.out.println("Enter amount to spread: ");
				int amount = in.nextInt();
				
				pantry.useJam(jam, amount);
			}
		}
	}
}