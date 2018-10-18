package decisions;

import java.util.Scanner;

public class Prize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount you received for your fifth birthday");
		double amount = input.nextDouble();
		if (Math.abs(amount - Math.sqrt(amount)) < 0.0001) {
			System.out.println("You have won a good prize!");
		} else {
			System.out.println("You have won a bad prize!");
		}
	}

}
