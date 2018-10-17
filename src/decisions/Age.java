package decisions;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = input.nextInt();
		System.out.println("I hope you have a great day!");
		if (age <= 17) {
			System.out.println("Your are getting an A in this class.");
		}
	}

}
