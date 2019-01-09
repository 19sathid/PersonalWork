package recursion;

import java.util.Scanner;

public class SumOfOdd {
	public static int sumofOdd(int x) {
		int sum = 0;
		if ((x % 2) != 0 && x > 0) {
			sum += x;
			return (x + sumofOdd(x - 2));
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		while ((num % 2) == 0) {
			System.out.println("Try again! Enter an odd number");
			num = input.nextInt();
		}
		System.out.println(sumofOdd(num));
		input.close();
	}

}
