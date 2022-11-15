public class Lab {
	private int maxCapacity;
	private int numInstalled;
	Computer[] computer;
	private static int CURRENT_YEAR = 2022;

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
			temp += CURRENT_YEAR - computer[i].getYearMade();
		}
		return temp / numInstalled;
	}

	public Computer newest() {
		Computer temp = computer[0];
		for(int i = 1; i < numInstalled; i++) {
			if(temp.compareToOlder(computer[i]) < 0) {
				temp = computer[i];
			}
		}
		return temp;
	}

	public Computer fastest() {
		Computer temp = computer[0];
		for(int i = 1; i < numInstalled; i++) {
			if(temp.compareToFaster(computer[i]) < 0) {
				temp = computer[i];
			}
		}
		return temp;
	}

	public Computer mostRAM() {
		Computer temp = computer[0];
		for(int i = 1; i < numInstalled; i++) {
			if(temp.compareToRAM(computer[i]) < 0) {
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
			if(computer[i].getWarranty() == CURRENT_YEAR + 1) {
				counter++;
			}
		}
		Computer expiring[] = new Computer[counter];
		counter = 0;
		for(int i = 0; i < numInstalled; i++) {
			if(computer[i].getWarranty() == CURRENT_YEAR + 1) {
				expiring[counter] = computer[i];
				counter++;
			}
		}
		return expiring;
	}
}
