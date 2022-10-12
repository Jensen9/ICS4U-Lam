import java.util.Scanner;
public class PrintTriangle {
	public static String printTriangle(int n) {
		if(n == 0) {
			return "";
		}
		else {
			String a = printTriangle(n - 1);
			a += "*";
			System.out.println(a);
			return a;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		printTriangle(num);
	}
}
