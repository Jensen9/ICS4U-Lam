public class Lab {
	private static int MAX_CAPACITY = 10;
	private int computers;
	Computer[] computer;
	
	// Constructor
	public Lab(Computer[] list) {
		computer = new Computer[MAX_CAPACITY];
		for(int i = 0; i < MAX_CAPACITY; i++) {
			computer[i] = list[i];
		}
	}
}
