import java.util.Scanner;
public class TowerOfHanoi {
	public static int countMoves(int height) {
		if(height == 0) {
			return 0;
		}
		else {
			return 2 * countMoves(height - 1) + 1;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int height = in.nextInt();
		System.out.println(countMoves(height));
	}
}
