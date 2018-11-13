package decisions;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		int number = input.nextInt();
		int num = 0;
		for (int counter = 1; counter <= number; counter++) {
			if ((number % counter) == 0) {
				num++;
			}
		}
		if (num > 2) {
			System.out.println("Composite");
		} else {
			System.out.println("Prime");
		}
	}

}
