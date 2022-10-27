public class Fraction {
	int num;
	int den;

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
		num = num * p.num;
		den = den * p.num;
		this.reduce();
	}
	public void reduce() {
		int div = gcd(num, den);
		num /= div;
		den /= div;
	}
	public static int gcd(int x, int y) {
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
}
