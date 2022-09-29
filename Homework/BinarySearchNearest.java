public class BinarySearchNearest {
	public static int binarySearchNearest(int array[], int num) {
		int bottom = 0;
		int top = array.length - 1;
		int middle = 0;
		
		while(bottom <= top) {
			middle = (top + bottom) / 2;
			
			if(num == array[middle]) {
				return middle;
			}
			else if(num > array[middle]) {
				bottom = middle + 1;
			}
			else if(num < array[middle]) {
				top = middle - 1;
			}
		}
		
		int bottomDifference = num - array[middle - 1];
		if(middle < array.length - 1) {
			int topDifference = array[middle + 1] - num;
			
			if(bottomDifference > topDifference) {
				return middle + 1;
			}
			else {
				return middle - 1;
			}
		}
		else {
			return middle - 1;
		}
	}
	
	public static void main(String[] args) {
		int arrayOfInts[] = {0, 2, 5, 9, 15, 20, 26};
		int index = binarySearchNearest(arrayOfInts, 23);
		
		System.out.println("Index or nearest index: " + index);
	}
}
