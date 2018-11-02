package decisions;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int number = input.nextInt();
		int counter = 0;
		int divisor = 0;
		int sum = 0;
		for (counter = 2; counter <= number; counter = counter + 2) {
			if (number % counter == 0) {
				divisor = counter;
				System.out.println(divisor);
				sum += divisor;

			}

			// System.out.println("Enter a positive number(Enter 999 to quit");
			// number = input.nextInt();
		}
		System.out.println("Sum of even divisors: " + sum);
		// while(number!=999);

	}

}
