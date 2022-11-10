import java.util.Scanner;
public class BagTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// Getting variables
		System.out.println("Bag #1");
		System.out.println("Bag Style: ");
		String bagStyle1 = in.nextLine();
		
		System.out.println("Binder #1:");
		System.out.println("Label: ");
		String style1 = in.nextLine();
		
		System.out.println("Colour: ");
		String colour1 = in.nextLine();
		
		System.out.println("Sheets: ");
		int sheets1 = in.nextInt();
		
		in.nextLine();
		
		System.out.println("Binder #2:");
		System.out.println("Label: ");
		String style2 = in.nextLine();
		
		System.out.println("Colour: ");
		String colour2 = in.nextLine();
		
		System.out.println("Sheets: ");
		int sheets2 = in.nextInt();
		
		in.nextLine();
		
		System.out.println("\nBag #2");
		System.out.println("Bag Style: ");
		String bagStyle2 = in.nextLine();
		
		System.out.println("Binder #1:");
		System.out.println("Label: ");
		String style3 = in.nextLine();
		
		System.out.println("Colour: ");
		String colour3 = in.nextLine();
		
		System.out.println("Sheets: ");
		int sheets3 = in.nextInt();
		
		in.nextLine();
		
		System.out.println("Binder #2:");
		System.out.println("Label: ");
		String style4 = in.nextLine();
		
		System.out.println("Colour: ");
		String colour4 = in.nextLine();
		
		System.out.println("Sheets: ");
		int sheets4 = in.nextInt();
		
		// Initializing school bags
		SchoolBag bagOne = new SchoolBag(new Binder(style1, colour1, sheets1), new Binder(style2, colour2, sheets2));
		
		Binder binderThree = new Binder(style3, colour3, sheets3);
		Binder binderFour = new Binder(style4, colour4, sheets4);
		SchoolBag bagTwo = new SchoolBag(binderThree, binderFour);
		bagOne.setStyle(bagStyle1);
		bagTwo.setStyle(bagStyle2);
		
		boolean exit = false;
		
		while(!exit) { // Loops until -1 is inputted
			System.out.print("Please select a schoolbag (by ID, 1 or 2): ");
			int bagNum = in.nextInt();
			
			if(bagNum == -1) {
				exit = true;
			}
			else {
				System.out.print("Please select a binder in schoolbag " + bagNum + " (by ID, 1 or 2): ");
				int binderNum = in.nextInt();
				
				System.out.print("Add (a) or remove (r) sheets: ");
				String adjust = in.next();
				
				System.out.print("# of sheets: ");
				int add = in.nextInt();
				
				if(adjust.equals("a")) {
					if(bagNum == 1) {
						bagOne.add(binderNum, add);
					}
					else {
						bagTwo.add(binderNum, add);
					}
				}
				else {
					if(bagNum == 1) {
						bagOne.remove(binderNum, add);
					}
					else {
						bagTwo.remove(binderNum, add);
					}
				}
			}
		}
		
		// Printing information on both school bags
		System.out.println("SchoolBag #1: \n" + bagOne);
		System.out.println("\nSchoolBag #2: \n" + bagTwo);
	}
}
