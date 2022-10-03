import java.util.Arrays;
public class SelectionSortSimple {
	public static void selectionSort(double array[]) {
        for(int i = array.length - 1; i > 0; i--) {
            double maxIndex = array[0];
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
        double array[] = {0.7, 2.3, 5.2, 0.2, 4.2, 6.4};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
