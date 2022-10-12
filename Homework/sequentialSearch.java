public class sequentialSearch {

	public static int sequentialSearch1(int[] array, int value) {
		int pos = -1;
		for(int i = 0; i < array.length; i++) {
			if(value == array[i]) {
				pos = i;
			}
		}
		return pos;
	}

	public static int sequentialSearch2(int[] array, int value) {
		boolean found = false;
		int pos = -1;
		for(int i = 0; i < array.length && !found; i++) {
			if(value == array[i]) {
				pos = i;
				found = true;
			}
		}
		return pos;
	}

	public static int sequentialSearch3(int[] array, int value) {
		for(int i = 0; i < array.length; i++) {
			if(value == array[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arrayOfInts = {0,3,54,2,64,21};
		System.out.println(sequentialSearch1(arrayOfInts, 54));
		System.out.println(sequentialSearch2(arrayOfInts, 2));
		System.out.println(sequentialSearch3(arrayOfInts, 21));
	}
}