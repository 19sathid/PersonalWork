package decisions;

import java.util.Scanner;

public class LargestDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int number = input.nextInt();
		int largest = 0;
		for (int counter = 1; counter < number; counter++) {
			if (number % counter == 0) {
				if (counter > largest) {
					largest = counter;
				}
			}
		}
		System.out.println("Largest divisor: " + largest);
	}
}
