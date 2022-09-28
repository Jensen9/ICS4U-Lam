import java.util.Scanner;
import java.util.Arrays;

public class BinarySearchString
{
	public static int binarySearchString(String[] array, String word) {
        int bottom = 0;
        int top = array.length - 1;
        
        while(bottom <= top) {
            int middle = (top + bottom) / 2;
            int compareString = word.compareTo(array[middle]);
            
            if(compareString == 0) {
                return middle;
            }
            else if(compareString > 0) {
                bottom = middle + 1;
            }
            else if(compareString < 0) {
                top = middle - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        String[] words = new String[20];
        Scanner in = new Scanner(System.in);
        
        for(int i = 0; i < words.length; i++) {
            System.out.print("String value #" + (i+1) + ": ");
            words[i] = in.nextLine();
        }
        Arrays.sort(words);
        
        System.out.print("Word to find: ");
        String word = in.nextLine();
        int index = binarySearchString(words, word);
        
        if(index == -1) {
            System.out.println("Word not found.");
        }
        else {
            System.out.println("Word found at index: " + index);
        }
    }
}
