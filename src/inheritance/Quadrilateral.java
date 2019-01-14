package inheritance;

public class Quadrilateral {
	private double s1;
	private double s2;
	private double s3;
	private double s4;

	public Quadrilateral() {
		s1 = 10;
		s2 = 15;
		s3 = 10;
		s4 = 15;
	}

	public Quadrilateral(double xS1, double xS2, double xS3, double xS4) {
		s1 = xS1;
		s2 = xS2;
		s3 = xS3;
		s4 = xS4;
	}

	public double getSide1() {
		return s1;
	}

	public double getSide2() {
		return s2;
	}

	public double getSide3() {
		return s3;
	}

	public double getSide4() {
		return s4;
	}

	public void setSide1(double xS1) {
		s1 = xS1;
	}

	public void setSide2(double xS2) {
		s1 = xS2;
	}

	public void setSide3(double xS3) {
		s1 = xS3;
	}

	public void setSide4(double xS4) {
		s1 = xS4;
	}

	public double perimeter() {
		return (s1 + s2 + s3 + s4);
	}

	public String toString() {
		return ("Quadrilateral : Side 1 : " + s1 + " Side 2 : " + s2 + " Side 3 : " + s3 + " Side 4 : " + s4);
	}
}
