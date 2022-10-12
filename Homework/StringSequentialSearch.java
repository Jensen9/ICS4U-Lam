/**
 * Name: Jensen Sung
 * Date: 09/26/2022
 * Description: Finds index of string in string array
 */

public class StringSequentialSearch {
	public static int seqSearch(String[] array, String item) {
		for(int i = 0; i < array.length; i++) {
			if(item == array[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		String[] names = {"Joe", "Dave", "Evan"};
		
		System.out.println(seqSearch(names, "Evan"));
	}
}