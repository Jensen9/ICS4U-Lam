import java.util.*;

public class LabTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter maximum capacity of lab: ");
		int max = in.nextInt();
		
		Lab lab = new Lab("computer.txt", max);
		
		System.out.println("The average age is: " + lab.averageAge());

		System.out.println("\nThe newest computer:\n" + lab.newest());

		System.out.println("\nThe fastest computer:\n" + lab.fastest());
		if(lab.fastest() == lab.mostRAM()) {
			System.out.println("Has most ram");
		} else {
			System.out.println("Does not have most ram");
		}

		in.nextLine();
		
		System.out.println("\nEnter a manufacturer: ");
		String manufacturer = in.nextLine();
		System.out.println(lab.madeBy(manufacturer));

		System.out.print("\nExpiring next year: ");
		Computer expiring[] = lab.expiring();
		for(int i = 0; i < expiring.length; i++) {
			System.out.print(expiring[i].getSerial() + "\t");
		}
	}
}