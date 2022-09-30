import java.util.Arrays;

public class Median {
	public static int medianInsertionSort(int array[]) {
		for(int i = 0; i < array.length; i++) {
			int j = i;
			int key = array[i];

			while(j > 0 && key < array[j - 1]) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = key;
		}
		
		if((array.length) % 2 == 1) {
			return array[array.length / 2];
		}
		else {
			return (array[(array.length / 2)] + array[(array.length / 2) - 1]) / 2;
		}
	}

	public static void main(String[] args) {
		int integers[] = {23, 31, 32, 54, 67, 87, 97, 97};
		System.out.println(Arrays.toString(integers));
		System.out.println("Median: ~" + medianInsertionSort(integers));
	}
}
