package objectorientedprogramming;

public class Triangle {
//instance fields
	private double base;
	private double height;
	
	//constructors
	public Triangle() {
		base = 10.0;
		height = 9.0;
	}

	public Triangle(double newBase, double newHeight) {
		base = newBase;
		height = newHeight;
	}
	
	// Mutator methods
		public void setBase(double newBase) {
			base = newBase;
		}
		public void setHeight(double newHeight) {
			height = newHeight;
		}
	
	// Accessor Methods
		public double getBase() {
			return base;
		}

		public double getHeight() {
			return height;
		}

		public double hypot() {
			return Math.hypot(base,height);
		}
		public double perimeter() {
			return base+height+Math.hypot(base, height);
		}
		public double area() {
			return 0.5*base*height;
		}
}
