package arrays;

import java.util.Scanner;
import java.util.Random;

public class RollingDice1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Enter the number of students in the class");
		int num = input.nextInt();
		System.out.println("Enter the number of sides on a die");
		int numSides = input.nextInt();
		int max = numSides;
		int min = 1;
		System.out.println("Enter the number of times each student should roll");
		int numRolls = input.nextInt();
		int[][] rolls = new int[num][numRolls];
		for (int i = 1; i < num + 1; i++) {
			for (int r = 0; r < rolls.length; r++) {
				System.out.print("Student # " + i + " : ");
				for (int c = 0; c < rolls[0].length; c++) {
					rolls[r][c] = min + rand.nextInt(max - min + 1);
					System.out.print("  " + rolls[r][c] + "   ");
				}
				System.out.println(" ");

			}
		}

	}
}
