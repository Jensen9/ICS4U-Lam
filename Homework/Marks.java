import java.io.*;
import java.util.Arrays;

public class Marks {
	public static void main(String[] args) {
		final int STUDENTS = 10;
		final int TESTS = 5;
		
		double[][] marks = new double[STUDENTS][TESTS];
		String line = "";
		try {
			BufferedReader in = new BufferedReader(new FileReader("marks.txt"));
			BufferedWriter out = new BufferedWriter(new FileWriter("result.txt"));
			int student = 0;
			
			while((line = in.readLine()) != null) {
				
			}
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(Arrays.toString(marks));
	}
}
