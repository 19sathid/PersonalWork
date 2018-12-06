package arrays;

import java.util.Scanner;

public class SeatingChart {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of students in the class");
		int num = input.nextInt();
		input.nextLine();

		if (num % 4 == 0) {
			int rows = num / 4;
			int columns = 4;
			String[][] names = new String[rows][columns];

			for (int r = 0; r < names.length; r++) {
				for (int c = 0; c < names[0].length; c++) {
					System.out.println("Enter the full name of the student");
					names[r][c] = input.nextLine();
				}
			}

			System.out.println("");

			for (int r = 0; r < names.length; r++) {
				for (int c = 0; c < names[0].length; c++) {
					System.out.print(names[r][c].charAt(0) + "   ");
				}
				System.out.println("");
			}

			System.out.println("");

			for (int r = 0; r < names.length; r++) {
				for (int c = 0; c < names[0].length; c++) {
					String lastName = names[r][c].substring(names[r][c].indexOf(' ') + 1, names[r][c].length());
					System.out.print(lastName + "   ");
				}
				System.out.println("");
			}

			System.out.println("");

			for (int r = 0; r < names.length; r++) {
				for (int c = 0; c < names[0].length; c++) {
					String firstName = names[r][c].substring(0, names[r][c].indexOf(' '));
					System.out.print(firstName + "   ");
				}
				System.out.println("");
			}

			System.out.println("");

			for (int r = 0; r < names.length; r++) {
				for (int c = 0; c < names[0].length; c++) {
					System.out.print(names[r][c].length() - 1 + "   ");
				}
				System.out.println("");
			}

			System.out.println("");

			int highestLength = 0;
			String longestName = "";
			for (int r = 0; r < names.length; r++) {
				for (int c = 0; c < names[0].length; c++) {
					if ((names[r][c].length() - 1) > highestLength) {
						highestLength = names[r][c].length() - 1;
						longestName = names[r][c];
					}
				}
			}
			System.out.println("Longest name : " + longestName);
		}

		input.nextLine();
		System.out.println("The number is not valid");

		input.close();
	}

}
