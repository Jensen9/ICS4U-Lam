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
		int index = oldestIndex();
		Shirt temp = shirts[index];
		if(temp == null) {
			return false;
		} else {
			shirts[index] = shirts[shirts.length - 1];
			shirts[shirts.length - 1] = null;
			numShirt--;
			return true;
		}
	}

	public int shirtsSized(int size) {
		int num = 0;
		for(int i = 0; i < numShirt; i++) {
			if(shirts[i].getSize() == size) {
				num++;
			}
		}
		return num;
	}

	public Shirt newest() {
		Shirt temp = shirts[0];
		for(int i = 1; i < shirts.length; i++) {
			if(temp.compareToAge(shirts[i]) > 0) {
				temp = shirts[i];
			}
		}
		return temp;
	}

	public Shirt biggest() {
		Shirt temp = shirts[0];
		for(int i = 1; i < shirts.length; i++) {
			if(temp.compareToSize(shirts[i]) < 0) {
				temp = shirts[i];
			}
		}
		return temp;
	}

	private int oldestIndex() {
		int index = 0;
		for(int i = 1; i < numShirt; i++) {
			if(shirts[index].compareToAge(shirts[i]) > 0) {
				index = i;
			}
		}
		return index;
	}
}
