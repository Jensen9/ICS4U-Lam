public class BinarySearchString {
	public static int binaryStringSearch(String array[], String word) {
		int bottom = 0;
		int top = array.length-1;
		boolean found = false;
		int i = -1;
		while(bottom <= top && !found) {
			int middle = (top + bottom) / 2;
			int compare = word.compareTo(array[middle]);
			
			if(compare == 0) {
				i = middle;
				found = true;
			}
			else if(compare > 0) {
				bottom = middle + 1;
			}
			else {
				top = middle - 1;
			}
		}
		return i;
	}
	
	public static void main(String[] args) {
		String words[] = {"Apple", "Kiwi", "Orange", "Peach", "Pear"};
		System.out.println(binaryStringSearch(words, "Kiwi"));
	}
}