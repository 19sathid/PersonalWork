package inheritance;

public class Trapezoid extends Quadrilateral implements Geo{
	private double height;

	public Trapezoid() {
		super(5, 6, 7, 8);
		double base = Math.abs(super.getSide4() - super.getSide2());
		height = Math.sqrt((super.getSide4() * super.getSide4()) + (base * base));
	}

	public Trapezoid(double side1, double side2, double side3, double side4) {
		super(side1, side2, side3, side4);
		double base = Math.abs(super.getSide4() - super.getSide2());
		height = Math.sqrt((super.getSide4() * super.getSide4()) + (base * base));
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double h) {
		height = h;
	}

	public double area() {
		double area = ((super.getSide2() + super.getSide4()) / 2) * height;
		return area;
	}
}
