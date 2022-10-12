import java.util.Arrays;
import java.util.Scanner;

public class SortThreeLetters {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter first character: ");
		char firstCharacter = in.next().charAt(0);
		System.out.print("Enter second character: ");
		char secondCharacter = in.next().charAt(0);
		System.out.print("Enter third character: ");
		char thirdCharacter = in.next().charAt(0);

		if(firstCharacter >= 'a' && firstCharacter <= 'z' && secondCharacter >= 'a' && secondCharacter <= 'z' && thirdCharacter >= 'a' && thirdCharacter <= 'z') {
			char[] allCharacters = {firstCharacter, secondCharacter, thirdCharacter};
			Arrays.sort(allCharacters);
			for(char ch: allCharacters) {
				System.out.print(ch);
			}
		}
		else System.out.println("Enter lowercase letters.");
	}
}