import java.util.Arrays;

public class InsertionSortPlanets
{
	public static void insertionSort(String array[]) {
		for(int i = 0; i < array.length; i++) {
			String temp = array[i];
			int j = i - 1;
			

			while(j >= 0 && (temp.compareTo(array[j])) < 0) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = temp;
		}
	}

	public static void main(String[] args) {
		String planets[] = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
		System.out.println(Arrays.toString(planets));
		insertionSort(planets);
		System.out.println(Arrays.toString(planets));
	}
}
