public class Closet {
	private int maxShirt;
	private int numShirt;
	Shirt[] shirts;
	
	// Constructor
	public Closet(int maxShirt) {
		this.maxShirt = maxShirt;
		shirts = new Shirt[maxShirt];
		numShirt = 0;
	}
	
	// Accessor
	public int getMaxShirt() {
		return maxShirt;
	}
	
	public int getNumShirt() {
		return numShirt;
	}
	
	// Mutator
	public void setMaxShirt(int maxShirt) {
		this.maxShirt = maxShirt;
	}
	
	public void setNumShirt(int numShirt) {
		this.numShirt = numShirt;
	}
	
	// Methods
	public boolean addShirt(String colour, int size, int yearPurchased) {
		if(numShirt < maxShirt) {
			shirts[numShirt] = new Shirt(colour, size, yearPurchased);
			numShirt++;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean removeOldest() {
		int index = oldestIndex(shirts);
		if(index == -1) {
			return false;
		} else {
			for(int i = index; i < shirts.length - 1; i++) {
				Shirt temporary = shirts[i];
				shirts[i] = shirts[i + 1];
				shirts[i + 1] = temporary;
			}
			
			numShirt--;
			return true; 
		}
	}
	
	public int shirtsSized(int size) {
		int num = 0;
		for(int i = 0; i < shirts.length; i++) {
			if(shirts[i] != null && shirts[i].getSize() == size) {
				num++;
			}
		}
		return num;
	}
	
	public Shirt newest() {
		int index = -1;
		for(int i = 0; i < shirts.length - 1; i++) {
			if(shirts[i].age() < shirts[i + 1].age()) {
				index = i;
			}
		}
		return shirts[index];
	}
	
	public Shirt biggest() {
		Shirt temp = shirts[0];
		for(int i = 1; i < shirts.length; i++) {
			if(temp.getSize() < shirts[i].getSize()) {
				temp = shirts[i];
			}
		}
		return temp;
	}
	
	private int oldestIndex(Shirt[] array) {
		int oldest = -1;
		for(int i = 0; i < array.length - 1; i++) {
			if(array[i] != null && array[i + 1] != null && array[i].age() > array[i + 1].age()) {
				oldest = i;
			}
		}
		return oldest;
	}
}
