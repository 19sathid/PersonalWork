package decisions;

import java.util.Scanner;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		int integer = input.nextInt();
		while (integer != 9999) {
			System.out.println(integer * 2);
			System.out.println("Enter an integer");
			integer = input.nextInt();
		}
	}

}
