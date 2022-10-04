import java.util.Arrays;

public class AlgorithmsStringExamples {
	public static int sequentialSearch(String array[], String word) {
		for(int i = 0; i < array.length; i++) {
			if(array[i].equals(word) == true) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(String array[], String word) {
		int bottom = 0;
		int top = array.length - 1;
		
		while(bottom <= top) {
			int middle = (top + bottom) / 2;
			int stringValue = word.compareTo(array[middle]);
			
			if(stringValue == 0) {
				return middle;
			}
			else if(stringValue < 0) {
				top = middle - 1;
			}
			else {
				bottom = middle + 1;
			}
		}
		return -1;
	}
	
	public static void insertionSort(String array[]) {
		for(int i = 0; i < array.length; i++) {
			int index = i;
			String temp = array[i];
			
			while(index > 0 && temp.compareTo(array[index - 1]) < 0) {
				array[index] = array[index - 1];
				index--;
			}
			array[index] = temp;
		}
	}
	
	public static void selectionSort(String array[]) {
		for(int i = array.length - 1; i > 0; i--) {
			String maxIndex = array[0];
			int index = 0;
			
			for(int j = 0; j <= i; j++) {
				if(array[j].compareTo(maxIndex) > 0) {
					maxIndex = array[j];
					index = j;
				}
			}
			array[index] = array[i];
			array[i] = maxIndex;
		}
	}
	
	public static void bubbleSort(String array[]) {
		boolean sorted = false;
		for(int i = array.length - 1; i > 0 && !sorted; i--) {
			sorted = true;
			for(int j = 0; j < i; j++) {
				String temp = array[j];
				if(temp.compareTo(array[j + 1]) > 0) {
					sorted = false;
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		String array[] = {"Apple", "Bee", "Call", "Drone"};
		System.out.println(sequentialSearch(array, "Drone"));
		System.out.println(binarySearch(array, "Call"));
		
		String array2[] = {"c", "a", "d", "z", "q", "w"};
		insertionSort(array2);
		System.out.println(Arrays.toString(array2));
		
    	String array3[] = {"c", "a", "d", "z", "q", "w"};
		selectionSort(array3);
		System.out.println(Arrays.toString(array3));
		
		String array4[] = {"c", "a", "d", "z", "q", "w"};
		bubbleSort(array4);
		System.out.println(Arrays.toString(array4));
	}
}
