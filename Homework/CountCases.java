/**
 * Name: Jensen Sung
 * Date: 09/20/2022
 * Description: This program reads passage.txt and counts the amount of uppercase and lowercase characters
 */

import java.io.*;

public class CountCases {
	public static void main(String[] args) {
		int uppercase = 0, lowercase = 0;
    
		try {
			BufferedReader read = new BufferedReader(new FileReader("passage.txt"));
			String line = "";
			
			while((line = read.readLine()) != null) {
				for(int i = 0; i < line.length(); i++) {
					if(Character.isLowerCase(line.charAt(i)) == true) {
						lowercase++;
					}
					else if(Character.isUpperCase(line.charAt(i)) == true) {
						uppercase++;
					}
				}
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Uppercase letters: " + uppercase);
		System.out.println("Lowercase letters: " + lowercase);
	}
}
