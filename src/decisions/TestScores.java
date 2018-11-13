package decisions;

import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter test1 score");
		double test1 = input.nextDouble();
		System.out.println("Enter test2 score");
		double test2 = input.nextDouble();
		System.out.println("Enter test3 score");
		double test3 = input.nextDouble();
		double average = (test1 + test2 + test3) / 3;
		if (average > 92.5) {
			System.out.println("A");
		}
		if (average > 84.5 && average <= 92.5) {
			System.out.println("B");
		}
		if (average > 77.5 && average <= 84.5) {
			System.out.println("C");
		}
		if (average > 69.5 && average <= 77.5) {
			System.out.println("D");
		}
		if (average > 0 && average <= 69.5) {
			System.out.println("F");
		}
	}
}
