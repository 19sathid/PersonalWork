package decisions;

import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int multiples = 0;
		System.out.println("Enter an endpoint for the multiples");
		int number = input.nextInt();
		while (multiples <= number) {
			System.out.println(multiples);
			multiples = multiples + 2;
		}
	}

}
