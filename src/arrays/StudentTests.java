package arrays;

import java.util.Scanner;

public class StudentTests {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of students in class");
		int num = input.nextInt();
		System.out.println("Enter the number of tests taken");
		int numofTests = input.nextInt();
		int rows = num;
		int columns = numofTests;
		int[][] scores = new int[rows][columns];
		int allAverage = 0;

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < columns; c++) {
				System.out.println("Enter the scores for each of the tests");
				scores[r][c] = input.nextInt();
				allAverage += scores[r][c];
			}
		}

		allAverage = allAverage / (rows * columns);
		for (int r = 0; r < rows; r++) {
			double studentAverage = 0;
			for (int c = 0; c < columns; c++) {
				studentAverage += scores[r][c];
			}
			System.out.println("Test Average of Student " + (r + 1) + " : " + studentAverage / columns);
		}

		for (int c = 0; c < columns; c++) {
			double testAverage = 0;
			for (int r = 0; r < rows; r++) {
				testAverage += scores[r][c];
			}
			System.out.println("Average of Test " + (c + 1) + " : " + testAverage / rows);
		}
		System.out.println("Overall Average of all the tests: " + allAverage);

		input.close();
	}
}
