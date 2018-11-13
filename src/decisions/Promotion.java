package decisions;

import java.util.Scanner;

public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Are you a sales person?");
		boolean salesPerson = input.nextBoolean();
		System.out.println("How many years of experience?");
		int years = input.nextInt();
		if ((salesPerson == true) && (years >= 3)) {
			System.out.println("You are eligible for promotion!");
		} else {
			System.out.println("Are you a delivery head");
			boolean deliveryHead = input.nextBoolean();
			if ((deliveryHead == true) && (years >= 5)) {
				System.out.println("You are eligible for promotion!");
			} else {
				System.out.println("You are not eligible for promotion!");
			}
		}
	}
}