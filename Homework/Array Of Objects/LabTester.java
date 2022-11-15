import java.io.*;
import java.util.*;

public class LabTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter maximum capacity of lab: ");
		int max = in.nextInt();
		
		Lab lab = new Lab(max);
		
		try {
			BufferedReader read = new BufferedReader(new FileReader("computer.txt"));
			
			int numComputers = Integer.parseInt(read.readLine());
			Computer computers[] = new Computer[numComputers];
			
			for(int i = 0; i < numComputers; i++) {
				String serialNum = read.readLine();
				String manufacturer = read.readLine();
				int yearMade = Integer.parseInt(read.readLine());
				int yearBought = Integer.parseInt(read.readLine());
				double processor = Double.parseDouble(read.readLine());
				int ram = Integer.parseInt(read.readLine());
				int warranty = Integer.parseInt(read.readLine());
				
				lab.installComputer(new Computer(serialNum, manufacturer, yearMade, yearBought, processor, ram, warranty));
			}
		}
		catch(IOException i) {
			System.out.println("file not found!");
		}
		
		System.out.println("The average age of computers in the lab is: " + lab.averageAge());
		
		System.out.println("\nNewest computer:\n" + lab.newest());
		
		System.out.println("\nFastest Computer:\n" + lab.fastest());
		if(lab.fastest() == lab.mostRAM()) {
			System.out.println("Has most ram.");
		} else {
			System.out.println("Does not have most ram.");
		}
		
		in.nextLine();
		System.out.print("\nEnter a manufacturer: ");
		String manufacturer = in.nextLine();
		System.out.println("There are " + lab.madeBy(manufacturer) + " computer(s) made by " + manufacturer);
		
		System.out.print("\nExpiring next year: ");
		Computer expiring[] = lab.expiring();
		for(int i = 0; i < expiring.length; i++) {
			System.out.print(expiring[i].getSerial() + "\t");
		}
	}
}
