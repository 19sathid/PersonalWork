package decisions;

import java.util.Scanner;

public class HowManyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		int sum = 0;
		int num = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		number = input.nextInt();
		do {
			System.out.println("Enter a number");
			number = input.nextInt();
			sum = number++;
			num++;
		} while (sum != 240);
		System.out.println("Number of numbers entered: " + num);
	}

}
