package decisions;

import java.util.Scanner;

public class Activity17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your favorite number");
		int number = input.nextInt();
		for (int counter = 1; counter <= 10; counter++) {
			System.out.println(number + " Hello");
		}
	}

}
