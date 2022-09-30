import java.util.Arrays;

public class InsertionSortSimple
{
    public static void insertionSort(double array[]) {
        for(int i = 0; i < array.length; i++) {
            double temp = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
    
	public static void main(String[] args) {
		double array[] = {2.2, 2.1, 1.7, 1.2, 5.5, 0.9};
		insertionSort(array);
		System.out.println(Arrays.toString(array));
	}
}
