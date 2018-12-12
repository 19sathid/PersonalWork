package arrays;

import java.util.Scanner;
import java.util.Random;

public class RollaDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Enter a roll number");
		int rollNum = input.nextInt();
		int min = 1;
		int max = 6;
		int[] numbers = new int[10000];
		while (rollNum <= 10000 && rollNum >= 0) {
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = min + rand.nextInt(max - min + 1);
			}
			System.out.println("The number rolled for " + rollNum + " is " + numbers[rollNum]);
			System.out.println("Enter a roll number");
			rollNum = input.nextInt();
		}
	}

}
