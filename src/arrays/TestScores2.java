package arrays;

import java.util.Scanner;

public class TestScores2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] scores = new int[10];
		for (int i = 0; i < scores.length; i++) {
			System.out.println("Enter a test score(integer)");
			scores[i] = input.nextInt();
		}

		int largest = 0;
		int smallest = 999;
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > largest) {
				largest = scores[i];
			}
			if (scores[i] < smallest) {
				smallest = scores[i];
			}
			sum += scores[i];
		}
		int average = sum / 10;

		System.out.println("The highest score is " + largest);
		System.out.println("The lowest score is " + smallest);
		System.out.println("The average of 10 test scores is " + average);
		System.out.println("The test scores are:");

		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
			System.out.println(scores[i]);
		}

		input.close();
	}

}
