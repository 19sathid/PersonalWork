package decisions;

import java.util.Scanner;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		int largest = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a two digit number(Enter 9999 to quit)");
		number = input.nextInt();
		while (number != 9999) {
			if (number > largest) {
				largest = number;
			}
				System.out.println("Enter a two digit number");
				number = input.nextInt();
		}
		System.out.println("Largest number:" + largest);
	}

}
