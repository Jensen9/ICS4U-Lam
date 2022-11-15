public class Computer {
	private String serial;
	private String manufacturer;
	private int yearMade;
	private int yearPurchased;
	private double processorSpeed;
	private int ram;
	private int warranty;
	
	// Constructor
	public Computer(String serial, String manufacturer, int yearMade, int yearPurchased, double processorSpeed, int ram, int warranty) {
		this.serial = serial;
		this.manufacturer = manufacturer;
		this.yearMade = yearMade;
		this.yearPurchased = yearPurchased;
		this.processorSpeed = processorSpeed;
		this.ram = ram;
		this.warranty = warranty;
	}
	
	// Accessors
	public String getSerial() {
		return serial;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public int getYearMade() {
		return yearMade;
	}
	
	public int getYearPurchased() {
		return yearPurchased;
	}
	
	public double getProcessorSpeed() {
		return processorSpeed;
	}
	
	public int getRam() {
		return ram;
	}
	
	public int getWarranty() {
		return warranty;
	}
	
	// Mutators
	public void setSerial(String serial) {
		this.serial = serial;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public void setYearMade(int yearMade) {
		this.yearMade = yearMade;
	}
	
	public void setYearPurchased(int yearPurchased) {
		this.yearPurchased = yearPurchased;
	}
	
	public void setProcessorSpeed(int processorSpeed) {
		this.processorSpeed = processorSpeed;
	}
	
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	
	// Methods
	public String toString() {
		return "Serial: " + serial + "\nManufacturer: " + manufacturer  + "\nYear Made: " + yearMade
				+ "\nYear Purchased: " + yearPurchased + "\nProcessor Speed: " + processorSpeed + "GHz\nRAM: " 
				+ ram + "GB\nWarranty: " + warranty;
	}
	
	public double compareToFaster(Computer other) {
		return this.processorSpeed - other.processorSpeed;
	}
	
	public int compareToRAM(Computer other) {
		return this.ram - other.ram;
	}
	
	public int compareToOlder(Computer other) {
		return this.yearMade - other.yearMade;
	}
}
