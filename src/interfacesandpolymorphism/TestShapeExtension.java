package interfacesandpolymorphism;

import java.util.Scanner;

public class TestShapeExtension {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle:");
		double length = input.nextDouble();
		System.out.println("Enter the width of the rectangle:");
		double width = input.nextDouble();
		System.out.println("Enter the radius of the circle: ");
		double radius = input.nextDouble();

		Shape box = new Rectangle(length, width);
		Shape ball = new Circle(radius);

		System.out.println("Perimeter of rectangle: " + box.perimeter());
		System.out.println("Area of rectangle: " + box.area());
		System.out.println("Circumference of circle: " + ball.perimeter());
		System.out.println("Area of circle: " + ball.area());

		input.close();
	}

}
