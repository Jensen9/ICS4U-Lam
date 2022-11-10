public class Binder {
	private String label;
	private String colour;
	private int sheets;
	private static int PAPER_WEIGHT;
	private static int EMPTY_BINDER_WEIGHT;
	
	// Constructors
	public Binder(String label, String colour, int sheets) { // If given all three paramaters
		this.label = label;
		this.colour = colour;
		this.sheets = sheets;
	}
	
	// Methods
	public void add(int sheets) { // Adding / Subtracting sheets to the binder
		if(sheets <= this.sheets * -1) {
			this.sheets = 0;
		}
		else {
			this.sheets += sheets;
		}
	}
	
	public int getWeight() { // Calculating weight
		return (sheets * PAPER_WEIGHT) + EMPTY_BINDER_WEIGHT;
	}
	
	public Binder heavier(Binder other) { // Comparing two binder objects and returns which one is heavier
		if(getWeight() > other.getWeight()) {
			return this;
		}
		else {
			return other;
		}
	}
	
	public String toString() { // Prints binder details
		return "Label: " + label + "\nColour: " + colour + "\n# of sheets: " + sheets;
	}
}
