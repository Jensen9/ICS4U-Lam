public class Paper {
	public static void main(String[] args) {	
		
		final int TIMESFOLDED = 40;
		double thickness = 0.09;
		
		for(int i = 1; i <= TIMESFOLDED; i++) {
			thickness *= (2*i);
		}
		
		System.out.println("The thickness of the paper is " + thickness);
		System.out.println("The area of the paper is " + (1 / Math.pow(2, 40)));
	}
}