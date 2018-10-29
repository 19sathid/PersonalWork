package decisions;

import java.util.Scanner;

public class TestScores2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int average = 0;
		int num = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter test score");
		int score = input.nextInt();
		while (score != 9999) {
			sum += score;
			num++;
			System.out.println("Enter test score");
			score = input.nextInt();
		}
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + sum / num);
	}

}
