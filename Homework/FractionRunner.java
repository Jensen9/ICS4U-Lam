public class FractionRunner {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(3, 5);
		Fraction f2 = new Fraction(7, -9);
		Fraction f3;
		Fraction f4 = new Fraction(8.137);
		
		System.out.println(f4);
		
		f3 = f1.larger(f2);
		
		f2.larger(f1);
		
		//	System.out.println(f1.size());
		//	System.out.println(f2.size());
	}

}
