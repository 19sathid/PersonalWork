package Strings;

import java.util.Scanner;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("First name: ");
		String first = input.nextLine();
		System.out.println("Last name: ");
		String second = input.nextLine();

		if (first.compareTo(second) < 0) {
			System.out.println(first + " comes before " + second);
		} else {
			if (first.compareTo(second) > 0) {
				System.out.println(second + " comes before " + first);
			} else {
				System.out.println("The names are the same.");
			}
		}
	}

}
