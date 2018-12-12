package arrays;

import java.util.Scanner;

public class ActivityPeople {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int rows = 4;
		int columns = 3;
		String[][] names = new String[rows][columns];

		for (int r = 0; r < names.length; r++) {
			for (int c = 0; c < names[0].length; c++) {
				System.out.println("Enter a full name of your friend");
				names[r][c] = input.nextLine();

			}
		}
		for (int r = 0; r < names.length; r++) {
			for (int c = 0; c < names[0].length; c++) {
				System.out.print(names[r][c].length() + "   ");
			}
			System.out.println("");
		}

	}
}
