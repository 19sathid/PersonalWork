package inheritance;

public class Rectangle extends Parallelogram implements Geo {
	public Rectangle() {
		super(6, 12, 6);
	}

	public Rectangle(double length, double width, double height) {
		super(length, width, width);
	}

	public double area() {
		return super.getSide1() * super.getSide2();
	}

	public String toString() {
		return ("Rectangle : " + super.toString());
	}

}
