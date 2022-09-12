/** 
 * Name: Jensen Sung
 * Date: 09/12/2022
 * Description: This program calculates the sum of a 2d array of integers
 */

public class NonUniform2DArray {
	public static void main(String[] args) {
		int[][] data = {{3, 2, 5}, 
				{1, 4, 4, 8, 13}, 
				{9, 1, 0, 2}, 
				{0, 2, 6, 4, -1, -8}}; 
		
		int sumOfArray = 0;
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				sumOfArray += data[i][j];
			}
		}
		System.out.println(sumOfArray);
	}
}
