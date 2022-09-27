import java.util.*;

public class SwapIntegerSequentialSearch
{
    public static int sequentialSearch(int array[], int value) {
        boolean found = false;
        int index = -1;
        for(int i = 0; i < array.length && !found; i++) {
            if(value == array[i]) {
                index = i;
                found = true;
            }
        }
        
        if(index > 0) {
            int temp = array[index];
            array[index] = array[index - 1];
            array[index - 1] = temp;
        }
        
        return index;
    }
    
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Size of array: ");
		int sizeOfArray = in.nextInt();
		int integers[] = new int[sizeOfArray];
		
		for(int i = 0; i < integers.length; i++) {
		    System.out.print("Value of " + (i+1) + ": ");
		    integers[i] = in.nextInt();
		}
		
		System.out.print("Integer to be found: ");
		int find = in.nextInt();
		System.out.println("Before: " + Arrays.toString(integers));
		
		int integersIndex = sequentialSearch(integers, find);
		
		if(integersIndex == -1) {
		    System.out.println("Integer not found.");
		}
		else {
		    System.out.println("\nInteger found at index " + integersIndex);
		    System.out.println("After: " + Arrays.toString(integers));
		}
	}
}
