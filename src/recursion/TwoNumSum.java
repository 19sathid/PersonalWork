package recursion;

import java.util.Scanner;

public class TwoNumSum {
	public static void sum(int x, int y) {
		if (x > 0 && y > 0) {
			int num1Last = x % 10;
			int num2Last = y % 10;
			int sum = num1Last + num2Last;
			System.out.print(sum + "  ");
			sum(x / 10, y / 10);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int digits1 = 1;
		int num1;
		int digits2 = 1;
		int num2;
		do {
			digits1 = 1;
			digits2 = 1;
			System.out.println("Enter the first number:");
			num1 = input.nextInt();
			int test1 = num1 / 10;
			while (test1 > 0) {
				test1 = test1 / 10;
				digits1++;
			}
			System.out.println("Enter the second number:");
			num2 = input.nextInt();
			int test2 = num2 / 10;
			while (test2 > 0) {
				test2 = test2 / 10;
				digits2++;
			}
		} while (digits1 != digits2);

		sum(num1, num2);

		input.close();
	}
}