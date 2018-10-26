package decisions;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = 0;
		System.out.println("Enter a number");
		number = input.nextInt();
		while (number != -1) {
			System.out.println(Math.pow(number, 3));
			System.out.println("Enter a number(enter -1 to quit)");
			number = input.nextInt();
		}
	}

}
