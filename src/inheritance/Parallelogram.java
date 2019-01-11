package inheritance;

public class Parallelogram extends Quadrilateral {
	private double height;

	public Parallelogram() {
		super(5, 8, 5, 8);
		height = 4;
	}

	public Parallelogram(double a, double b) {
		super(a, b, a, b);
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double h) {
		height = h;
	}

	public double area() {
		double area = super.getSide4() * height;
		return area;
	}
}
