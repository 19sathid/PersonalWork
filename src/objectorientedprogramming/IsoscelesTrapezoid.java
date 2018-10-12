package objectorientedprogramming;

public class IsoscelesTrapezoid {
//instance fields
	private double base1;
	private double base2;
	private double height;
	private double leg;

	// constructors
	public IsoscelesTrapezoid() {
		base1 = 99.0;
		base2 = 99.0;
		height = 99.0;
		leg = 99.0;
	}

	public IsoscelesTrapezoid(double newBase1, double newBase2, double newHeight, double newLeg) {
		base1 = newBase1;
		base2 = newBase2;
		height = newHeight;
		leg = newLeg;
	}

	// Mutator methods
	public void setBase1(double newBase1) {
		base1 = newBase1;
	}

	public void setBase2(double newBase2) {
		base2 = newBase2;
	}

	public void setHeight(double newHeight) {
		height = newHeight;
	}

	public void setLeg(double newLeg) {
		leg = newLeg;
	}

	// Accessor Methods
	public double getBase1() {
		return base1;
	}

	public double getBase2() {
		return base2;
	}

	public double getHeight() {
		return height;
	}

	public double getLeg() {
		return leg;
	}

	public double perimeter() {
		return base1 + base2 + (2 * leg);
	}

	public double area() {
		return 0.5 * height * (base1 + base2);
	}
}
