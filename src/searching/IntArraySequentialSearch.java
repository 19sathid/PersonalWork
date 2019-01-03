package searching;

import java.util.Scanner;
import java.util.Random;

public class IntArraySequentialSearch {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[100];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 1 + rand.nextInt(10000);
		}

		System.out.println("Enter a number");
		int num = input.nextInt();
		while (num != -1) {
			boolean answer = false;
			for (int x : numbers) {
				if (x == num) {
					answer = true;
				} else {
					answer = false;
				}
			}
			if (answer == true) {
				System.out.println("The number is in the array");
			} else {
				System.out.println("The number isn't in the array");
			}
			System.out.println("Enter a number (Enter -1 to quit)");
			num = input.nextInt();
		}
		
		input.close();
	}

}
