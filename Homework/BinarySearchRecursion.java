public class BinarySearchRecursion {
	public static int binarySearch(int list[], int num, int start, int end) {
		int middle = (start + end) / 2;
		if(end < start) {
			return -1;
		}
		if(num == list[middle]) {
			return middle;
		}
		else if(num > list[middle]) {
			return binarySearch(list, num, middle + 1, end);
		}
		else {
			return binarySearch(list, num, start, middle - 1);
		}
	}
	public static void main(String[] args) {
		int list[] = {2, 6, 8, 1, 7, 9, 32};
		System.out.println(binarySearch(list, 9, 0, list.length - 1));
	}
}
