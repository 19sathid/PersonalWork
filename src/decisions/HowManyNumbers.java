package decisions;

import java.util.Scanner;

public class HowManyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		int sum = 0;
		int counter = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		number = input.nextInt();
		do {
			sum += number;
			counter++;
			System.out.println("Enter a number");
			number = input.nextInt();
		} while (sum <= 2018);
		System.out.println("Number of numbers entered: " + counter);
	}

}
