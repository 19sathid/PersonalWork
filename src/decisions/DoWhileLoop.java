package decisions;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Pick anyone of the 3 cups");
		int cup = input.nextInt();
		int ball = 0;
		int attempt = 0;
		int total = 0;
		int result = 0;

		System.out.println("Pick anyone of the 3 cups");
		if (cup <= 3) {
			for (int counter = cup; counter <= 3; counter++) {
				attempt++;
				for (ball = 3; ball <= 3; ball--) {
					if (cup == ball)
						System.out.println("You WON");
					else {
						System.out.println("You LOSE");
					}

				}

			}
		}
		System.out.println("Pick anyone of the 3 cups");

		for (int counter = cup; counter <= 3; counter++) {
			System.out.println("Pick anyone of the 3 cups");

			for (ball = 3; ball <= 3; ball--) {
				if (cup == ball)
					System.out.println("You WON");
				else {
					System.out.println("You LOSE");

				}
			}

		}
	}
}
