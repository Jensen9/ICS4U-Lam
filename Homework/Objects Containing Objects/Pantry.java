public class Pantry {
    private Jam jam1;
    private Jam jam2;
    private Jam jam3;

    // Constructors
    public Pantry(Jam a, Jam b, Jam c) {
        jam1 = a;
        jam2 = b;
        jam3 = c;
    }

    // Methods
    public void useJam(int jam, int amount) {
    	if(jam == 1) {
    		jam1.use(amount);
    	}
    	else if(jam == 2) {
    		jam2.use(amount);
    	}
    	else {
    		jam3.use(amount);
    	}
    }
    
    public String toString() {
    	return "\nThe jams are: \n1: " + jam1 + "\n2: " + jam2 + "\n3: " + jam3;
    }
}