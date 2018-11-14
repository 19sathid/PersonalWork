package Strings;

import java.util.Scanner;

public class SocialSecurityNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your ssn(###-##-####");
		String ssn = input.nextLine();
		System.out.println("Last four digits" + ssn.substring(7));
		System.out.println("Middle two digits" + ssn.substring(4, 6));
		System.out.println("First three digits" + ssn.substring(0, 3));
	}

}
