package decisions;

import java.util.Scanner;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int average = 0;
		int sum = 0;
		int number = 0;
		int num1 = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a two digit number(Enter 9999 to quit)");
		number = input.nextInt();
		while (number != 9999) {
		num1++;
			sum = sum + number;
			System.out.println("Enter a two digit number");
			number = input.nextInt();
		}
		System.out.println("The average of the numbers:" + (sum/num1));

	}

	}

