public class LargestOfList {
	public static int largest(int[] list, int start, int end) {
		if(start == end) {
			return list[start];
		}
		else if(list[start] < list[end]) {
			return largest(list, start + 1, end);
		}
		else {
			return list[start];
		}
	}
	// Part B
	public static int largest(int[] list) {
		return largest(list, 0, list.length - 1);
	}
	
	public static void main(String[] args) {
		int list[] = {2, 6, 8, 1, 7, 9, 32};
		System.out.println(largest(list));
	}
}
