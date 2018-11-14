package Strings;

import java.util.Scanner;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a password");
		String password = input.nextLine();
		System.out.println("Verify your password");
		String verify = input.nextLine();

		while (!password.equals(verify)) {
			System.out.println("Password");
			password = input.nextLine();
			System.out.println("Verify");
			verify = input.nextLine();
		}

	}
}
