public class Shirt {
	private String colour;
	private int size;
	private int yearPurchased;
	private static int CURRENT_YEAR = 2022;
	
	// Constructor
	public Shirt(String colour, int size, int yearPurchased) {
		this.colour = colour;
		this.size = size;
		this.yearPurchased = yearPurchased;
	}
	
	// Accessor
	public String getColour() {
		return colour;
	}
	
	public int getSize() {
		return size;
	}
	
	public int getYearPurchased() {
		return yearPurchased;
	}
	
	// Mutator
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public void setYearPurchased(int yearPurchased) {
		this.yearPurchased = yearPurchased;
	}
	
	// Methods
	public int age() {
		return CURRENT_YEAR - yearPurchased;
	}
	
	public int compareToAge(Shirt other) {
		return this.yearPurchased - other.yearPurchased;
	}
	
	public int compareToSize(Shirt other) {
		return this.size - other.size;
	}
	
	public boolean equal(Shirt other) {
		if(this.colour == other.colour && this.size == other.size) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return "Colour: " + colour + "\nSize: " + size + "\nYear Purchased: " + yearPurchased;
	}
	
	
}
