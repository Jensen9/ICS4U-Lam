import java.util.Scanner;
public class PrintRow {
	public static void printRow(int n) {
		if(n > 1) {
			printRow(n - 1);
		}
		System.out.print("* ");
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		printRow(num);
	}
}
