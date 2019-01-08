package interfacesandpolymorphism;

import java.util.ArrayList;

public interface TestShapes {
	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		for (int i = 0; i < 3; i++) {
			shapes.add(new Rectangle(i + 5, i + 2));
		}

		for (int i = 0; i < 3; i++) {
			shapes.add(new Circle(i + 4));
		}

		double areaSum = 0;
		double smallPerim = 100000;
		for (Shape temp : shapes) {
			areaSum += temp.area();
			if (temp.perimeter() < smallPerim) {
				smallPerim = temp.perimeter();
			}
		}
		System.out.println("Sum of Areas: " + areaSum);
		System.out.println("Smallest Perimeter: " + smallPerim);
	}
}
