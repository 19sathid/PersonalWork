package arrays;

import java.util.Random;
import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int num = 5;
		int[] scores = new int[5];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter a test score");
			scores[i] = input.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum = sum + scores[i];
			System.out.println(scores[i]);
		}
		System.out.println("Sum of scores : " + sum);
		for (int i = num - 1; i >= 0; i--) {
			System.out.println(scores[i]);
		}
		Random generator = new Random();
		int min = 0;
		int max = 10;
		int largest = 0;
		int[] score = new int[10];
		for (int i = 0; i <= 10; i++) {
			score[i] = min + generator.nextInt(max - min + 1);
			if (score[i] > largest) {
				largest = score[i];
			}
		}
		System.out.println("The largest score is " + largest);
	}
}
