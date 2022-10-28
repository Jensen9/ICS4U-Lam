public class Fraction {
	private int num;
	private int den;

	public Fraction() { // Constructors
		num = 0;
		den = 1;
	}
	
	public Fraction(int numerator, int denominator) { 
		num = numerator;
		den = denominator;
	}
	
	public Fraction(Fraction fraction) {
		num = fraction.num;
		den = fraction.den;
	}
	
	public Fraction(double number) {
		if(number % 1 == 0) {
			num = (int) number;
			den = 1;
		}
		else { 
			int denominator = 1;
			while(number % 1 != 0) {
				denominator *= 10;
				number *= 10;
			}
			num = (int) number;
			den = denominator;
		}
	}
	
	public int getNumerator() { // Accessors
		return num;
	}
	
	public int getDenominator() {
		return den;
	}

	public void setNumerator(int numerator) {
		this.num = numerator;
	}

	public void setDenominator(int denominator) { // Mutators
		if(num == 0) {
			this.den = 1;
		}
		else {
			this.den = denominator;
		}
	}
	
	// Methods
	public double size() {
		return Math.abs((double)num / den);
	}
	
	public Fraction larger (Fraction other) {
		if (size() >= other.size()) {
			return this;
		} else {
			return other;
		}
	}
	
	public Fraction times(Fraction other) {
		Fraction product = new Fraction();
		
		product.num = num + other.num;
		product.den = den + other.den;
		product.reduce();
		return product;
	}
	
	public Fraction plus (Fraction other) {
		Fraction sum = new Fraction();
		
		sum.num = num + other.num;
		sum.den = den;
		sum.reduce();
		return sum;
	}
	
	public void timesEquals(Fraction p) {
		num *= p.num;
		den *= p.num;
		this.reduce();
	}
	
	public void reduce() {
		int div = gcd(num, den);
		num /= div;
		den /= div;
	}
	
	private static int gcd(int x, int y) {
		if(x == y) {
			return x;
		}
		else if(x > y) {
			return gcd(y, (x - y));
		}
		else {
			return gcd(y, x);
		}
	}
	
	public boolean equals(Fraction other) {
		return size() == other.size();
	}
	
	public double compareTo(Fraction other) {
		return size() - other.size();
	}
	
	public String toString() {
		return num  + "/" + den;
	}
}
