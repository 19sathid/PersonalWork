package arrays;

import java.util.Scanner;
import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random(5);
		int min = 1;
		int max = 100;
		int[] numbers = new int[10000];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = min + generator.nextInt(max - min + 1);
		}
		System.out.println("Enter an integer");
		int integer = input.nextInt();
		int count = 0;
		while (integer <= 100 && integer >= 0) {
			for (int i = 0; i < numbers.length; i++) {
				if (integer == numbers[i]) {
					count++;
				}
			}
			System.out.println("The number of times the number is in the array is " + count);
			System.out.println("Enter an integer");
			integer = input.nextInt();
		}
	}

}
