package objectorientedprogramming;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle box = new Rectangle();
		Circle ball = new Circle();
		Triangle abc = new Triangle();
		IsoscelesTrapezoid abcd = new IsoscelesTrapezoid();

		box = new Rectangle(5, 6);
		System.out.println("box perimeter:" + box.perimeter());
		System.out.println("box area:" + box.area());

		ball = new Circle(4);
		System.out.println("ball circumference:" + ball.circumference());
		System.out.println("ball area:" + ball.area());

		abc = new Triangle(3, 4);
		System.out.println("abc perimeter:" + abc.perimeter());
		System.out.println("abc area:" + abc.area());

		abcd = new IsoscelesTrapezoid(4, 7, 5, 6);
		System.out.println("abcd perimeter:" + abcd.perimeter());
		System.out.println("abcd area:" + abcd.area());

	}

}
