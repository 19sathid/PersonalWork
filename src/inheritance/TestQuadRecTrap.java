package inheritance;

public class TestQuadRecTrap {

	public static void main(String[] args) {
		Quadrilateral quad1 = new Quadrilateral();
		Quadrilateral quad2 = new Quadrilateral();
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle();
		Trapezoid trap1 = new Trapezoid();
		Trapezoid trap2 = new Trapezoid();

		System.out.println("Quadrilateral 1 perimeter : " + quad1.perimeter());
		System.out.println("Quadrilateral 2 perimeter : " + quad2.perimeter());
		System.out.println("Rectangle 1 perimeter : " + rec1.perimeter() + " , area : " + rec1.area());
		System.out.println("Rectangle 2 perimeter : " + rec2.perimeter() + " , area : " + rec2.area());
		System.out.println("Trapezoid 1 perimeter : " + trap1.perimeter() + " , area : " + trap1.area());
		System.out.println("Trapezoid 2 perimeter : " + trap2.perimeter() + " , area : " + trap2.area());

	}

}
