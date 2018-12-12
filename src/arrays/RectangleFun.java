package arrays;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.Box;

public class RectangleFun {

	public static void main(String[] args) {
		ArrayList<Rectangle> boxes = new ArrayList<Rectangle>();
		Random rand = new Random();

		for (int i = 0; i < 20; i++) {
			int min = 1;
			int max = 50;
			int length = min + rand.nextInt(max - min + 1);
			int width = min + rand.nextInt(max - min + 1);
			boxes.add(new Rectangle(length, width));
		}

		int largest = 0;
		int smallest = 2501;
		int largeLength = 0;
		int largeWidth = 0;
		int smallLength = 0;
		int smallWidth = 0;

		System.out.println("Areas of boxes:");
		for (int i = 0; i < boxes.size(); i++) {
			if (boxes.get(i).area() > largest) {
				largest = boxes.get(i).area();
				largeLength = boxes.get(i).getLength();
				largeWidth = boxes.get(i).getWidth();
			}
			if (boxes.get(i).area() < smallest) {
				smallest = boxes.get(i).area();
				smallLength = boxes.get(i).getLength();
				smallWidth = boxes.get(i).getWidth();
			}
			System.out.println(boxes.get(i).area());
		}
		
		//check if length and width matches the new area
		System.out.println("Largest area length and width " + largeLength + " " + largeWidth);
		System.out.println("Smallest area length and width " + smallLength + " " + smallWidth);

		for (int i = 0; i < boxes.size(); i++) {
			boxes.set(0, new Rectangle(largeLength, largeWidth));
			boxes.set(19, new Rectangle(smallLength, smallWidth));
			System.out.println(boxes.get(i).area());
		}
	}

}
