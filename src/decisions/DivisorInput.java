package decisions;

import java.util.Scanner;

public class DivisorInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int integer = input.nextInt();
		int highest = 0;
		int largest = 0;
		int divisor = 0;
		for (int numerator = 1; numerator <= integer; numerator++) {
			for (int denominator = 1; denominator <= numerator; denominator++) {
				if (numerator % denominator == 0) {
					divisor++;
				}
				if (divisor >= highest) {
					highest = divisor;
					largest = numerator;
				}
			}
			divisor = 0;
		}
		System.out.println(largest);
	}
}
