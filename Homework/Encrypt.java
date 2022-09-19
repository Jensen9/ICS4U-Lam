/**
 * Name: Jensen Sung
 * Date: 09/15/2022
 * Description: Encrypts word(s) that user inputs by swapping first and last character and adding two to the ASCII values of middle letters
 */
import java.util.*;

public class Encrypt {
	
	public static String encryptString(String str) {
		String encryptedString = "";
		encryptedString += str.charAt(str.length() - 1);
		
		for(int i = 1; i < str.length()-1; i++) {
			encryptedString += (char)(str.charAt(i) + 2);
		}
		encryptedString += str.charAt(0);
		
		return encryptedString;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a line to be encrypted: ");
		String[] line = in.nextLine().split(" ");
		
		for(int i = 0; i < line.length; i++) {
			System.out.print(encryptString(line[i]) + " ");
		}
	}
}
