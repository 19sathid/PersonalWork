package decisions;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 1;
		int factorial = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int num = input.nextInt();
		for (int counter = 1; counter <= num; counter++) {
		total = total*counter;
		}
		System.out.println(total);
	}

}
