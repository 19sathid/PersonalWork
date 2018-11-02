package decisions;

import java.util.Scanner;

public class PrimeFactorisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		int number = input.nextInt();
		for (int factor = 2; factor <= number; factor++) {
			while (number % factor == 0) {
				number = number / factor;
				System.out.println(factor);
			}
		}

	}
}
