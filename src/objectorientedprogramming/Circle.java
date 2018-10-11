package objectorientedprogramming;

public class Circle {
	// instance fields
	private double radius;

	// constructors
	public Circle() {
		radius = 5.0;
	}

	public Circle(double newRadius) {
		radius = newRadius;
	}

	// Mutator methods
	public void setRadius(double newRadius) {
		radius = newRadius;
	}

	// Accessor Methods
	public double getRadius() {
		return radius;
	}

	public double circumference() {
		return 2 * radius * Math.PI;
	}

	public double area() {
		return Math.PI * radius * radius;
	}
}
