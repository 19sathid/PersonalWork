package decisions;

import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int number = input.nextInt();
		int average = 0;
		int total = 0;
		int score = 0;
		for (int counter = 1; counter <= number; counter++) {
			System.out.println("Enter test score");
			score = input.nextInt();
			total = total + score;
			average = total / number;
		}
		System.out.println("Average: " + average);

	}
}
