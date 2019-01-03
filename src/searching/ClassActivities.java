package searching;

import java.util.Scanner;

import arrays.Rectangle;

import java.util.ArrayList;
import java.util.Random;

public class ClassActivities {

	public static void main(String[] args) {
		ArrayList<Integer> satScores = new ArrayList<Integer>();
		Random rand = new Random(5);
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 1000; i++) {
			int min = 400;
			int max = 1600;
			int score = min + rand.nextInt(max - min + 1);
			satScores.add(score);
		}

		System.out.println("Enter a SAT score");
		int score = input.nextInt();
		boolean answer = false;
		for (Integer x : satScores) {
			if (x == score) {
				answer = true;
			} else {
				answer = false;
			}
		}
		System.out.println("Does the ArrayList contain the score? " + answer);

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			int min = 0;
			int max = 499;
			int num = min + rand.nextInt(max - min + 1);
			numbers.add(num);
		}
		System.out.println("Enter an integer");
		int num = input.nextInt();
		int times = 0;
		for (Integer y : numbers) {
			if (y == num) {
				times++;
			}
		}
		System.out.println(num + " is in the array " + times + " times");

		ArrayList<Rectangle> boxes = new ArrayList<Rectangle>();
		for (int i = 0; i < 100; i++) {
			int min = 0;
			int max = 499;
			int length = min + rand.nextInt(max - min + 1);
			int width = min + rand.nextInt(max - min + 1);
			boxes.add(new Rectangle(length, width));
		}
		int counter = 0;
		for (Rectangle z : boxes) {
			if (Math.abs(z.getWidth() - 10) < 0.00001) {
				counter++;
			}
		}

		System.out.println("There are " + counter + " rectangles with width 10.");

		input.close();
	}

}
