public class Circle {
	private int x;
	private int y;
	private int radius;
	
	// Accessor
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getRadius() {
		return radius;
	}
	
	// Mutators
	public void setX(int xCoord) {
		x = xCoord;
	}
	public void setY(int yCoord) {
		y = yCoord;
	}
	public void setRadius(int rad) {
		radius = rad;
	}
	
	// Constructors
	public Circle() {
		x = 0;
		y = 0;
		radius = 1;
	}
	
	public Circle(int xCoord, int yCoord, int rad) {
		x = xCoord;
		y = yCoord;
		if(rad < 0) {
			rad *= -1;
		}
		radius = rad;
	}
	
	public Circle(Circle a) {
		x = a.x;
		y = a.y;
		radius = a.radius;
	}
	
	// Methods
	public double area() {
		return Math.pow(radius * Math.PI, 2);
	}
	
	public Circle smaller(Circle a) {
		if(this.area() == a.area() || this.area() < a.area()) {
			return this;
		}
		else {
			return a;
		}
	}
	
	public double distance(Circle a) {
		return Math.sqrt(Math.pow(x - a.x, 2) + Math.pow(y - a.y, 2));
	}
	
	public boolean isInside(Circle a) {
		if(x == a.x && y == a.y && a.radius <= radius) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean equals(Circle a) {
		if(x == a.x && y == a.y && radius == a.radius) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return "centre: (" + x + ", " + y + ") radius: " + radius;
	}
}
