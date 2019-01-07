package interfacesandpolymorphism;

import java.util.ArrayList;

public interface TestShapes {
	public static void main(String[] args) {
		ArrayList<Shape> object = new ArrayList<Shape>();
		object.add(new Rectangle(1, 1));
		object.add(new Rectangle(2, 3));
		object.add(new Rectangle(3, 4));
		object.addAll(new Circle(5));
		object.addAll(new Circle(7));
		object.addAll(new Circle(8));
		double areaSum = 0;
		double smallPerim = (Shape) object.get(0).perimeter();//
		for (Shape temp : object) {
			areaSum += temp.area();
			if (temp.perimeter() < smallPerim) {
				smallPerim = temp.perimeter();
			}
		}
		System.out.println("Sum of Areas: " + areaSum);
		System.out.println("Smallest Perimeter: " + smallPerim);
	}
}
