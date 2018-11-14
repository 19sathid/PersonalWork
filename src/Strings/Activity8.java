package Strings;

import java.util.Scanner;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Write a name");
		String name1 = input.nextLine();
		System.out.println("Write a name");
		String name2 = input.nextLine();
		if (name1.compareToIgnoreCase(name2) < 0) {
			System.out.println(name1.toUpperCase());
		} else {
			System.out.println(name2.toUpperCase());
		}

	}

}
