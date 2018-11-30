package arrays;

import java.util.Scanner;

public class LongandShortNames {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				System.out.println("Enter the number of people you know");
				int num = input.nextInt();
				String[] names = new String[num];
				String[] firstName = new String[num];
				String[] lastName = new String[num];
				for(int i = 0; i < num; i++) {
					System.out.println("Enter the first and last names of each person");
					names[i] = input.nextLine();
				}
				int longest = 0;
				int indexOfLongest = 0;
				for(int i = 0; i < num; i++) {
					if(longest < names[i].length()) {
						longest = names[i].length();
						indexOfLongest = i;
					}
				}
				String longestName = names[indexOfLongest];
				/*	firstName[i] = names[i].substring(0, names[i].indexOf(" "));
					System.out.println(firstName[i]);
					lastName[i] = names[i].substring(names[i].indexOf(" ") + 1, names.length -1);
					System.out.println(lastName);
				*/

input.close();
	}

}
