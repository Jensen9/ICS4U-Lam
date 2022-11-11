import java.io.*;
import java.util.*;

public class LabTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter maximum capacity of lab: ");
		int max = in.nextInt();
		
		
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
				
				Computer temp = new Computer(serialNum, manufacturer, yearMade, yearBought, processor, ram, warranty);
				computers[i] = temp;
			}
			
			Lab lab = new Lab(computers);
			System.out.println(lab);
			
			System.out.println(lab.averageAge());
			
			System.out.println(lab.newest());
			
			System.out.println(lab.fastest());
			if(lab.fastest() == lab.mostRAM()) {
				System.out.println("Has most ram");
			} else {
				System.out.println("Does not have most ram");
			}
			
			System.out.println("Enter a manufacturer: ");
			String manufacturer = in.nextLine();
			System.out.println(lab.madeBy(manufacturer));
			
			System.out.println("Expiring next year: ");
			Computer expiring[] = lab.expiring();
			for(int i = 0; i < expiring.length; i++) {
				System.out.print(expiring[i].getWarranty() + "\t");
			}
		}
		catch(IOException i) {
			System.out.println("file not found!");
		}
		
		
	}
}
