import java.util.Arrays;

public class AlgorithmsExamples {
	public static int sequentialSearch(int array[], int num) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == num) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int array[], int num) {
		int bottom = 0;
		int top = array.length - 1;
		
		while(bottom <= top) {
			int middle = (top + bottom) / 2;
			
			if(array[middle] == num) {
				return middle;
			}
			else if(array[middle] > num) {
				top = middle - 1;
			}
			else {
				bottom = middle + 1;
			}
		}
		return -1;
	}
	
	public static void insertionSort(int array[]) {
		for(int i = 0; i < array.length; i++) {
			int index = i;
			int temp = array[i];
			
			while(index > 0 && temp < array[index - 1]) {
				array[index] = array[index - 1];
				index--;
			}
			array[index] = temp;
		}
	}
	
	public static void selectionSort(int array[]) {
		for(int i = array.length - 1; i > 0; i--) {
			int maxIndex = array[0];
			int index = 0;
			
			for(int j = 0; j <= i; j++) {
				if(array[j] > maxIndex) {
					maxIndex = array[j];
					index = j;
				}
			}
			array[index] = array[i];
			array[i] = maxIndex;
		}
	}
	
	public static void bubbleSort(int array[]) {
		boolean sorted = false;
		for(int i = array.length - 1; i > 0 && !sorted; i--) {
			sorted = true;
			for(int j = 0; j < i; j++) {
				int temp = array[j];
				if(temp > array[j + 1]) {
					sorted = false;
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int array[] = {1, 5, 23, 56, 69, 81, 92};
		System.out.println(sequentialSearch(array, 56));
		System.out.println(binarySearch(array, 92));
		
		int array2[] = {52, 5, 65, 12, 88, 31};
		insertionSort(array2);
		System.out.println(Arrays.toString(array2));
		
		int array3[] = {52, 5, 65, 12, 88, 31};
		selectionSort(array3);
		System.out.println(Arrays.toString(array3));
		
		int array4[] = {52, 5, 65, 12, 88, 31};
		bubbleSort(array4);
		System.out.println(Arrays.toString(array4));
	}
}