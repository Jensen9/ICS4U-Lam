public class JackCard {
	private String name;
	private double balance;
	private int discount;
	private int points;
	private int pin;
	private static double maxBalance;
	
	//Accessors
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getDiscount() {
		return discount;
	}
	
	public int getPoints() {
		return points;
	}
	
	public int getPIN() {
		return pin;
	}
	
	public static double getMaxBalance() {
		return maxBalance;
	}
	
	//Mutators
	public void setName(String n) {
		name = n;
	}
	
	public void setBalance(double b) {
		balance = b;
	}
	
	public void setPoints(int p) {
		points = p;
	}
	
	static void setMaxBalance(double m) {
		maxBalance = m;
	}
	
	//Constructor
	public JackCard() {
		name = "default";
		balance = 0;
		discount = 0;
		points = 0;
		pin = 1234;
	}
	
	public JackCard(String n, double b, int p) {
		name = n;
		balance = b;
		pin = p;
		discount = calculateDiscount();
	}
	
	//Methods
	public int calculateDiscount() {
		if(balance >= 500) {
			return 5;
		}
		else if(balance >= 200) {
			return 3;
		}
		else if(balance >= 100) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public boolean refill(int amt) {
		if(balance + amt > maxBalance) {
			balance = maxBalance;
			discount = calculateDiscount();
			return false;
		} 
		else {
			balance += amt;
			discount = calculateDiscount();
			return true;
		}
	}
	
	public boolean pay(double amt, int p, boolean usePoints) {
		if(p != pin || amt > balance || usePoints && points < 2) {
			return false;
		}
		
		if(!usePoints) {
			balance -= amt * (1 - (discount / 100));
			points += amt / 2;
		}
		else {
			amt -= points / 20;
			points = points % 20;
			balance -= amt * (1 - (discount / 100));
			points += amt / 2;
		}
		
		if(balance > maxBalance) {
			balance = maxBalance;
		}
		
		discount = calculateDiscount();
		return true;
	}
	
	public JackCard higherBalance(JackCard a) {
		if(balance > a.balance || balance == a.balance) {
			return this;
		}
		else {
			return a;
		}
	}
	
	public JackCard morePoints(JackCard a) {
		if(points > a.points || points == a.points) {
			return this;
		}
		else {
			return a;
		}
	}
	
	public void combinePoints(JackCard a) {
		points += a.points;
		a.points = 0;
	}
	
	public boolean changePIN(String n, int p) {
		if(n.equals(name) == false) {
			return false;
		}
		else {
			pin = p;
			return true;
		}
	}
	
	public String toString() {
		return "Card Holder: " + name + "\nBalance: $" + balance 
				+ "\nDiscount Rate: " + discount + "%\nPoints: " + points
				+ "\nPIN: " + pin + "\n";
	}
}
