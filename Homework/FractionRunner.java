public class FractionRunner {

	public static void main(String[] args) {
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction();
		Fraction f3;
		Fraction f4 = new Fraction();
		
		f1.num = 3;
		f1.den = 5;
		
		f2.num = 7;
		f2.den = -9;
		
		f3 = f1.larger(f2);
		
		f2.larger(f1);
		
		f4.num = 16;
		f4.den = 24;
		
		f4.reduce();
		
		System.out.println(f4.num + "/" + f4.den);
		
		//	System.out.println(f1.size());
		//	System.out.println(f2.size());
	}

}
