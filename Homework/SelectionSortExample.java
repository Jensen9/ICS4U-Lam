import java.util.Arrays;
public class SelectionSortExample
{
    public static void selectionSort(int array[]) {
        for(int i = array.length - 1; i > 0; i--) {
            int maxIndex = array[0];
            int index = 0;
            for(int j = 0; j <= i; j++) {
                if(array[j] > maxIndex) {
                    maxIndex = array[j];
                    index = j;
                }
            }
            array[index] = array[i];
            array[i] = maxIndex;
        }
    }
    
	public static void main(String[] args) {
	    int array[] = {25, 9, 11, 31, 23, 2 ,42, 15, 26};
	    selectionSort(array);
		System.out.println(Arrays.toString(array));
	}
}
