public class Lab {
	private int maxCapacity;
	private int numInstalled;
	Computer[] computer;

	// Mutator
	public void setMaxCapacity(int max) {
		maxCapacity = max;
	}

	// Constructor	
	public Lab(int max) {
		maxCapacity = max;
		computer = new Computer[max];
		numInstalled = 0;
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
		for(int i = 1; i < numInstalled; i++) {
			if(temp.getYearMade() > computer[i].getYearMade()) {
				temp = computer[i];
			}
		}
		return temp;
	}

	public Computer fastest() {
		Computer temp = computer[0];
		for(int i = 1; i < numInstalled; i++) {
			if(temp.getProcessorSpeed() < computer[i].getProcessorSpeed()) {
				temp = computer[i];
			}
		}
		return temp;
	}

	public Computer mostRAM() {
		Computer temp = computer[0];
		for(int i = 1; i < numInstalled; i++) {
			if(temp.getRam() < computer[i].getRam()) {
				temp = computer[i];
			}
		}
		return temp;
	}

	public int madeBy(String manufacturer) {
		int made = 0;
		for(int i = 0; i < numInstalled; i++) {
			if(computer[i].getManufacturer().equalsIgnoreCase(manufacturer)) {
				made++;
			}
		}
		return made;
	}

	public Computer[] expiring() {
		int counter = 0;
		for(int i = 0; i < numInstalled; i++) {
			if(computer[i].getWarranty() == 2023) {
				counter++;
			}
		}
		Computer expiring[] = new Computer[counter];
		counter = 0;
		for(int i = 0; i < numInstalled; i++) {
			if(computer[i].getWarranty() == 2023) {
				expiring[counter] = computer[i];
				counter++;
			}
		}
		return expiring;
	}
}
