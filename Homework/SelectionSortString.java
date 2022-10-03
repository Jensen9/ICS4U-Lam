import java.util.Arrays;
import java.util.Scanner;
public class SelectionSortString {
	public static void selectionSort(String array[]) {
		for(int i = 0; i < array.length-1; i++) {
			String maxIndex = array[i];
			int index = i;
			
			for(int j = index + 1; j < array.length; j++) {
				if(array[j].compareTo(array[index]) < 0) {
					index = j;
				}
			}
			array[i] = array[index];
            array[index] = maxIndex;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] words = new String[10];
		for(int i = 0; i < words.length; i++) {
			System.out.print("Enter a word: ");
			words[i] = in.nextLine();
		}
		System.out.println(Arrays.toString(words));	
		selectionSort(words);
		System.out.println(Arrays.toString(words));
	}
}
