package arrays;

import java.util.Random;
import java.util.Scanner;

public class RollaDie2 {

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
				if (numbers[rollNum] == numbers[i]) {
					System.out.println(i);
				}
			}
			System.out.println("Enter a roll number");
			rollNum = input.nextInt();
		}
	}

}
