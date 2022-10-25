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
		
		return product;
	}
	public Fraction plus (Fraction other) {
		Fraction sum = new Fraction();
		
		sum.num = num + other.num;
		sum.den = den;

		return sum;
	}
	public void timesEquals(Fraction p) {
		this.num = num * p.num;
		this.den = den * p.num;
	}
}
