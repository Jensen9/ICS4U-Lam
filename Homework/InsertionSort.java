import java.util.Arrays;

public class InsertionSort {
	public static void insertionSort(int array[]) {
		for(int i = 0; i < array.length; i++) {
			int j = i;
			int key = array[i];

			while(j > 0 && key < array[j - 1]) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = key;
		}
	}

	public static void main(String[] args) {
		int integers[] = {25, 9, 11, 31, 23, 2, 42, 15, 26};
		System.out.println(Arrays.toString(integers));
		insertionSort(integers);
		System.out.println(Arrays.toString(integers));
	}
}