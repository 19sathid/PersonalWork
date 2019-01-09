package recursion;

import java.util.Scanner;

public class SumTheNumbers {
	public static int sumNumbers(int x) {
		int sum = 0;
		if (x > 0) {
			sum += x;
			return (x + sumNumbers(x - 1));
		}
		return x;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		System.out.println(sumNumbers(num));
		input.close();
	}

}
