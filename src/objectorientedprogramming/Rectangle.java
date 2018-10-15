package objectorientedprogramming;

public class Rectangle {
	// instance fields
	private double length;
	private double width;

	// constructors
	public Rectangle() {
		length = 10;
		width = 5;
	}

	public Rectangle(double newLength, double newWidth) {
		length = newLength;
		width = newWidth;
	}

	// Mutator methods
	public void setLength(double newLength) {
		length = newLength;
	}

	public void setWidth(double newWidth) {
		width = newWidth;
	}

	// Accessor Methods
	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double perimeter() {
		return 2 * (length + width);
	}

	public double area() {
		return length * width;
	}
}
