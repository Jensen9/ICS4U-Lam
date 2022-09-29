public class BinarySearchDescending {
	public static int binarySearchDescending(int array[], int num) {
		int bottom = 0;
		int top = array.length - 1;

		while(bottom <= top) {
			int middle = (top + bottom) / 2;

			if(num == array[middle]) {
				return middle;
			}
			else if(num < array[middle]) {
				bottom = middle + 1;
			}
			else if(num > array[middle]) {
				top = middle - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int descendingIntegers[] = {99,85,76,66,59,44,36,21,17,9};
		int index = binarySearchDescending(descendingIntegers, 99);
		
		if(index == -1) {
			System.out.println("Integer not found.");
		}
		else {
			System.out.println("Integer found at index " + index);
		}
	}
}
