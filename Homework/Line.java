import java.util.*;

public class Line {
	// Part 1
	public static double length (int x1, int y1, int x2, int y2) {
		return Math.sqrt(((y2-y1) * (y2-y1)) + ((x2-x1) * (x2-x1)));
	}

	public static double slope (int x1, int y1, int x2, int y2) {
		return (y2-y1) / (x2-x1);
	}
}