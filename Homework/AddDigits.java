/**
 * Name: Jensen Sung
 * Date: 09/15/2022
 * Description: User inputs integer and adds each digit individually
 */
import java.util.Scanner;

public class AddDigits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		String integer = in.nextLine();
		int sum = 0;
		for(int i = 0; i < integer.length(); i++) {
			sum += integer.charAt(i) - '0';
		}
		System.out.println(sum);
	}
}
