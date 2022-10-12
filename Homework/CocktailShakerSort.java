import java.util.Arrays;

public class CocktailShakerSort {
	public static void shakeSort(String[] array) {
		boolean sorted = false;
		for(int i = 0; i < array.length - 1 && !sorted; i++) {
			sorted = true;
			
			if(i % 2 == 1) {
				for(int j = 0; j < array.length - 1; j++) {
					String temp = array[j];
					if(temp.compareTo(array[j + 1]) > 0) {
						array[j] = array[j + 1];
						array[j + 1] = temp;
						sorted = false;
					}
				}
			}
			else {
				for(int j = array.length - 1; j > 0; j--) {
					String temp2 = array[j];
					if(temp2.compareTo(array[j - 1]) < 0) {
						array[j] = array[j - 1];
						array[j - 1] = temp2;
						sorted = false;
					}
				}
			}
			System.out.println(Arrays.toString(array));
		}
	}

	public static void main(String[] args) {
		String[] words = {"b", "a", "x", "z", "c", "g", "j", "h", "i"};
		shakeSort(words);
	}

}
