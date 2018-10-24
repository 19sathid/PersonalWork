package decisions;

import java.util.Scanner;

public class Acivity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = 0;
		System.out.println("Enter an integer");
		number = input.nextInt();
		do {
			number = number * 17;
			System.out.println("Magic number:" + number);
			System.out.println("Enter an integer(Enter 9999 to quit)");
			number = input.nextInt();
		} while (number < 9999);

	}
}
