package arrays;

import java.util.Scanner;

public class LongandShortNames {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of people you know");
		int num = input.nextInt();
		input.nextLine();
		// clear buffer
		String[] names = new String[num];

		for (int i = 0; i < num; i++) {
			System.out.println("Enter the first and last name of each person");
			names[i] = input.nextLine();
		}

		int longest = 0;
		int indexOfLongest = 0;
		for (int i = 0; i < num; i++) {
			if (longest < names[i].length()) {
				longest = names[i].length();
				indexOfLongest = i;
			}
		}

		int smallest = 999;
		int indexOfSmallest = 0;
		for (int i = 0; i < num; i++) {
			if (smallest > names[i].length()) {
				smallest = names[i].length();
				indexOfSmallest = i;
			}
		}

		for (int i = 0; i < num; i++) {
			System.out.println(names[i]);
		}

		System.out.println("The longest name is " + names[indexOfLongest]);
		System.out.println("The smallest name is " + names[indexOfSmallest]);
		System.out.println("The range of lengths of the names " + (longest - smallest));

		input.close();
	}

}
