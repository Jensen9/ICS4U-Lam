

public class BinarySearch {
	public static int binarySearch(int array[], int value) {
		int bottom = 0;
		int top = array.length-1;
		boolean found = false;
		int i = -1;
		while(bottom <= top && !found) {
			int middle = (bottom+top) / 2;
			if(value == array[middle]) {
				found = true;
				i = middle;
			}
			else if(value > array[middle]) {
				bottom = middle + 1;
			}
			else {
				top = middle - 1;
			}
		}
		return i;
	}

	public static void main(String[] args) {
		int nums[] = {1,8,12,26,47,55,67,87,91,102};
		System.out.println(binarySearch(nums, 47));
	}
}