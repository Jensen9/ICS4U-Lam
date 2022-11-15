import java.io.*;
import java.util.Scanner;

public class ClosetRunner {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Max Shirts: ");
		int max = in.nextInt();
		in.nextLine();
		
		Closet closet = new Closet(max);
		
		try {
			BufferedReader read = new BufferedReader(new FileReader("boyShirts.txt"));
			
			int numShirts = Integer.parseInt(read.readLine());
			for(int i = 0; i < numShirts; i++) {
				String colour = read.readLine();
				int size = Integer.parseInt(read.readLine());
				int yearPurchased = Integer.parseInt(read.readLine());
				
				closet.addShirt(colour, size, yearPurchased);
			}
			
		} catch(IOException e) {
			System.out.println("File error");
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Shirt #" + (i + 1) + " colour: ");
			String colour = in.nextLine();
			
			System.out.println("Shirt #" + (i + 1) + " size: ");
			int size = in.nextInt();
			
			System.out.println("Shirt #" + (i + 1) + " year purchased: ");
			int yearPurchased = in.nextInt();
			
			if(closet.getMaxShirt() == closet.getNumShirt()) {
				closet.removeOldest();
			}
			in.nextLine();
			closet.addShirt(colour, size, yearPurchased);
		}

		System.out.print("\nSize of shirt: ");
		int size = in.nextInt();
		
		System.out.println("There are " + closet.shirtsSized(size) + " sized " + size + "\n");
		
		System.out.println("The biggest shirt is:\n" + closet.biggest());
	}
}
