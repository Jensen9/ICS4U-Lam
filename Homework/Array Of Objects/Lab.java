import java.io.*;

public class Lab {
	private int maxCapacity;
	private int numInstalled = 0;
	Computer[] computer;

	// Mutator
	public void setMaxCapacity(int max) {
		maxCapacity = max;
	}

	// Constructor
	public Lab(String fileName, int max) {
		maxCapacity = max;
		
		String serial;
		String manufacturer;
		int yearMade;
		int yearPurchased;
		double processorSpeed;
		int ram;
		int warranty; 

		try {
			BufferedReader read = new BufferedReader(new FileReader("computer.txt"));

			int numComputers = Integer.parseInt(read.readLine());
			if(numComputers > maxCapacity) {
				numComputers = maxCapacity;
			}
			
			computer = new Computer[numComputers];
			
			for(int i = 0; i < numComputers; i++) {
				serial = read.readLine();
				manufacturer = read.readLine();
				yearMade = Integer.parseInt(read.readLine());
				yearPurchased = Integer.parseInt(read.readLine());
				processorSpeed = Double.parseDouble(read.readLine());
				ram = Integer.parseInt(read.readLine());
				warranty = Integer.parseInt(read.readLine());

				computer[i] = new Computer(serial, manufacturer, yearMade, yearPurchased, processorSpeed, ram, warranty);
				
				numInstalled++;
			}
		} catch(IOException iox) {
			System.out.println("Problem accessing files");
		}
	}
	
	public Lab(int max) {
		maxCapacity = max;
		computer = null;
	}

	// Methods
	public boolean installComputer(Computer a) {
		if(numInstalled < maxCapacity) {
			computer[numInstalled] = new Computer(a.getSerial(), a.getManufacturer(), a.getYearMade(), a.getYearPurchased(), a.getProcessorSpeed(), a.getRam(), a.getWarranty());
			numInstalled++;
			return true;
		}
		else {
			return false;
		}
	}

	public int averageAge() {
		int temp = 0;
		for(int i = 0; i < computer.length; i++) {
			temp += 2022 - computer[i].getYearMade();
		}
		return temp / numInstalled;
	}

	public Computer newest() {
		Computer temp = computer[0];
		for(int i = 1; i < computer.length; i++) {
			if(temp.getYearMade() > computer[i].getYearMade()) {
				temp = computer[i];
			}
		}
		return temp;
	}

	public Computer fastest() {
		Computer temp = computer[0];
		for(int i = 1; i < computer.length; i++) {
			if(temp.getProcessorSpeed() < computer[i].getProcessorSpeed()) {
				temp = computer[i];
			}
		}
		return temp;
	}

	public Computer mostRAM() {
		Computer temp = computer[0];
		for(int i = 1; i < computer.length; i++) {
			if(temp.getRam() < computer[i].getRam()) {
				temp = computer[i];
			}
		}
		return temp;
	}

	public int madeBy(String manufacturer) {
		int made = 0;
		for(int i = 0; i < computer.length; i++) {
			if(computer[i].getManufacturer().equalsIgnoreCase(manufacturer)) {
				made++;
			}
		}
		return made;
	}

	public Computer[] expiring() {
		int counter = 0;
		for(int i = 0; i < computer.length; i++) {
			if(computer[i].getWarranty() == 2023) {
				counter++;
			}
		}
		Computer expiring[] = new Computer[counter];
		counter = 0;
		for(int i = 0; i < computer.length; i++) {
			if(computer[i].getWarranty() == 2023) {
				expiring[counter] = computer[i];
				counter++;
			}
		}
		return expiring;
	}
}