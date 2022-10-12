import java.util.Arrays;

public class BubbleSort {
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
		int array[] = {23, 1, 64, 42, 99, 25};
		System.out.println(Arrays.toString(array));
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}
}