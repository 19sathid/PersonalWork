package inheritance;

public class Rectangle extends Quadrilateral {
	public Rectangle() {

	}

	public Rectangle(double length, double width) {
		this.setSide1(length);
		this.setSide2(width);
		this.setSide3(length);
		this.setSide4(width);
	}

	public double getArea() {
		return this.getSide1() * this.getSide2();
	}

}
