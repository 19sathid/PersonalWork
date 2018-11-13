package decisions;

import java.util.Scanner;

public class SumtheNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number(Enter 999 to quit)");
		num = input.nextInt();
		do {
			sum += num;
			System.out.println("Enter a number");
			num = input.nextInt();
		}while (num != 999);
		System.out.println("Sum: " + sum);
		
	}
}
