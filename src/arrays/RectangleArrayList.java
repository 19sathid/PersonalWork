package arrays;

import java.util.ArrayList;
import java.util.Random;

public class RectangleArrayList {

	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<Rectangle> boxes = new ArrayList<Rectangle>();

		for (int j = 0; j < 400; j++) {
			boxes.add(new Rectangle(50 + rand.nextInt(20), 50 + rand.nextInt(20)));
		}

		Rectangle removed = boxes.remove(rand.nextInt(boxes.size()));
		System.out.println("Length of rectangle removed:" + removed.getLength());

		System.out.println("The area of the rectangles are:");
		// areas in reverse order
		for (int j = boxes.size() - 1; j >= 0; j--) {
			Rectangle oneBox = boxes.get(j);
			System.out.println(oneBox.area());
		}

		boxes.add(new Rectangle(10, 10));
		boxes.add(new Rectangle(10, 20));
		boxes.add(new Rectangle(20, 10));
		boxes.add(new Rectangle(30, 30));
		if (boxes.size() > 0) {
			Rectangle last = boxes.remove(boxes.size() - 1);
			boxes.set(0, last);
		}

		System.out.println("State of the Rectangles");
		for (int i = 0; i < boxes.size(); i++) {
			Rectangle pack = boxes.get(i);
			System.out.println(pack.getLength());
			System.out.println(pack.getWidth());
		}
	}

}
