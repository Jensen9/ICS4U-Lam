public class Shirt {
	private String colour;
	private int size;
	private int yearPurchased;
	
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
		return 2022 - yearPurchased;
	}
	
	public Shirt newer(Shirt other) {
		if(this.yearPurchased > other.yearPurchased) {
			return this;
		} else {
			return other;
		}
	}
	
	public Shirt bigger(Shirt other) {
		if(this.size > other.size) {
			return this;
		} else {
			return other;
		}
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
