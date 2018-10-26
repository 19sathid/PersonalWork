package decisions;

import java.util.Scanner;

public class Activity19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		int total = 0;
		Scanner input = new Scanner(System.in);
		for (number = 1; number <= 5; number++) {
			System.out.println("Enter a number:");
			number = input.nextInt();
			total += number;
		}
		System.out.println(total);
	}

}
