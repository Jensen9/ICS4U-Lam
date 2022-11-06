public class Jam {
    private String content;
    private String date;
    private int size;
    
    // Constructor
    public Jam(String content, String date, int size) {
        this.content = content;
        this.date = date;
        this.size = size;
    }

    // Methods
    public boolean isEmpty() {
        return size <= 0;
    }

    public void use(int amount) {
        if(size == 0) {
        	System.out.println("No jam in the Jar!");
        }
        else if(amount > size) {
        	System.out.println("Spreading " + size + " fluid oz. of " + content);
            size = 0;
        }
        else {
            size -= amount;
            System.out.println("Spreading " + amount + " fluid oz. of " + content);
        }
    }

    public String toString() {
        return content + "   " + date + "   " + size + " fl. oz.";
    }
}
