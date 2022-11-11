public class Lab {
	private int maxCapacity;
	private int numInstalled = 0;
	Computer[] computer;
	
	// Mutator
	public void setMaxCapacity(int max) {
		maxCapacity = max;
	}
	
	// Constructor
	public Lab(Computer[] list) {
		computer = new Computer[list.length];
		for(int i = 0; i < list.length && i <= maxCapacity; i++) {
			computer[i] = list[i];
		}
		numInstalled += list.length;
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
		for(int i = 0; i < numInstalled; i++) {
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
			if(computer[i].getManufacturer().equals(manufacturer)) {
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
		for(int i = 0; i < computer.length; i++) {
			if(computer[i].getWarranty() == 2023) {
				expiring[expiring.length] = computer[i];
			}
		}
		return expiring;
	}
}
