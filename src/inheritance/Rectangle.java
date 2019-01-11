package inheritance;

public class Rectangle extends Parallelogram implements Geo{
	public Rectangle() {
		super(6, 12);
	}

	public Rectangle(double length, double width) {
		super(length, width);
	}

	public double area() {
		return super.getSide1() * super.getSide2();
	}

}
