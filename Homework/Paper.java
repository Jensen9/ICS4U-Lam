/**
 * Name: Jensen Sung
 * Date: 09/12/2022
 * Description: This program calculates the area and thickness of a piece of paper after it has been folded 40 times
 */

public class Paper {
	public static void main(String[] args) {
		final int TIMES_FOLDED = 40;
		
		double thickness = 0.09;
		double area = 1.0;
		
		for(int i = 0; i < TIMES_FOLDED; i++) {
			thickness *= 2;
		}
		
		for(int i = 0; i < TIMES_FOLDED; i++) {
			area /= 2;
		}
		
		System.out.println("The thickness of the paper after " + TIMES_FOLDED + " folds is " + thickness);
		System.out.println("The area of the paper after " + TIMES_FOLDED + " folds is " + area);
	}
}
