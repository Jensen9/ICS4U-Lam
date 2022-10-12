public class SequentialSearchExample {
	public static int sequentialSearch(int array[], int num) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == num) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int array[] = {1, 65, 23, 56, 99, 81, 32};
		
		System.out.println(sequentialSearch(array, 56));
	}
}