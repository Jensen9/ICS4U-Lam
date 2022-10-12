import java.util.Scanner;

public class CheckLine {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the two coordinates of line 1:");
		System.out.print("Vertex 1 x-value: ");
		int vertexX1 = in.nextInt();
		System.out.print("Vertex 1 y-value: ");
		int vertexY1 = in.nextInt();
		
		System.out.print("\nVertex 2 x-value: ");
		int vertexX2 = in.nextInt();
		System.out.print("Vertex 2 y-value: ");
		int vertexY2 = in.nextInt();
		
		System.out.println("\nPlease enter the two coordinates of line 1:");
		System.out.print("Vertex 1 x-value: ");
		int vertex2X1 = in.nextInt();
		System.out.print("Vertex 1 y-value: ");
		int vertex2Y1 = in.nextInt();
		
		System.out.print("\nVertex 2 x-value: ");
		int vertex2X2 = in.nextInt();
		System.out.print("Vertex 2 y-value: ");
		int vertex2Y2 = in.nextInt();
		
		double lineLength1 = Line.length(vertexX1, vertexY1, vertexX2, vertexY2);
		double lineLength2 = Line.length(vertex2X1, vertex2Y1, vertex2X2, vertex2Y2);
		
		double lineSlope1 = Line.slope(vertexX1, vertexY1, vertexX2, vertexY2);
		double lineSlope2 = Line.slope(vertex2X1, vertex2Y1, vertex2X2, vertex2Y2);
		
		System.out.println("\nResults:");
		if(lineLength1 == lineLength2) {
			System.out.println("The two lines have the same length.");
		}
		else System.out.println("The two lines do not have the same length.");
		
		if(lineSlope1 == lineSlope2) {
			System.out.println("The two lines are parallel.");
		}
		else if(lineSlope1 == (-1/lineSlope2) || (-1/lineSlope1) == lineSlope2) {
			System.out.println("The two lines are perpendicular");
		}
		else System.out.println("The two lines have no correlation.");
	}
}