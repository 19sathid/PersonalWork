package decisions;

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int number = input.nextInt();
		int num = 0;
		for (int counter = 1; counter <= number; counter++) {
			if (number % counter == 0) {
				num++;
			}
		}
		System.out.println("Number of divisors: " + num);
	}

}
