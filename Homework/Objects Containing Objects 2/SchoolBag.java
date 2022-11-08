public class SchoolBag {
	private String style;
	private Binder binderOne;
	private Binder binderTwo;
	private static int EMPTY_BAG_WEIGHT;
	
	// Constructors
	public SchoolBag(Binder one, Binder two) {
		binderOne = one;
		binderTwo = two;
	}
	
	public SchoolBag(String label1, String colour1, int sheets1, String label2, String colour2, int sheets2) {
		binderOne = new Binder(label1, colour1, sheets1);
		binderTwo = new Binder(label2, colour2, sheets2);
	}
	
	// Mutators
	public void setStyle(String style) {
		this.style = style;
	}
	
	// Methods
	public void add(int index, int sheets) {
		if(index == 1) {
			binderOne.add(sheets);
		}
		else {
			binderTwo.add(sheets);
		}
	}
	
	public void remove(int index, int sheets) {
		if(index == 1) {
			binderOne.add(0 - sheets);
		}
		else {
			binderTwo.add(0 - sheets);
		}
	}
	
	public int average() {
		return (binderOne.getWeight() + binderTwo.getWeight()) / 2;
	}
	
	public int weight() {
		return binderOne.getWeight() + binderTwo.getWeight() + EMPTY_BAG_WEIGHT;
	}
	
	public String toString() {
		return "Style: " + style + "\nBinder #1: \n" + binderOne
				+ "\nBinder #2: \n" + binderTwo;
	}
}
