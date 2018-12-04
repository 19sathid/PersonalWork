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

		for (int r = 0; r < num; r++) {
			for (int c = 0; c < numofTests; c++) {
				System.out.println("Enter the scores for each of the tests");
				scores[r][c] = input.nextInt();
			}
		}
		for (int r = 0; r < num; r++) {
			for (int c = 0; c < numofTests; c++) {
				System.out.println(scores[r][c] + "   ");
			}

		}
	}
}
