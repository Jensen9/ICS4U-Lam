import java.util.Scanner;
public class Power {
	public static int power(int x, int n) {
		if(n == 0) {
			return 1;
		}
		else {
			return x * power(x, n - 1);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int x = in.nextInt();
		System.out.print("Enter the power: ");
		int n = in.nextInt();

		int result = power(x, n);
		System.out.println(x + " to the power of " + n + " is " + result);
	}
}
