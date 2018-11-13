package decisions;

import java.util.Scanner;

public class Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int number = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a two digit number");
		number = input.nextInt();
		while (number != 9999) {
			sum = sum + number;
			System.out.println("Enter a two digit number");
			number = input.nextInt();
		}
		System.out.println("The sum of the numbers:" + sum);

	}

}
