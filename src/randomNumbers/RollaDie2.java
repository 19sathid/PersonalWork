package randomNumbers;

import java.util.Random;
import java.util.Scanner;

public class RollaDie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		System.out.println("Number of rolls");
		int rolls = input.nextInt();
		int randomNum = 0;
		int min = 1;
		int max = 6;
		int ones = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int fives = 0;
		int sixes = 0;
		for (int i = 0; i < rolls; i++) {
			randomNum = min + generator.nextInt(max - min + 1);
			if (randomNum == 1) {
				ones++;
			}
			if (randomNum == 2) {
				twos++;
			}
			if (randomNum == 3) {
				threes++;
			}
			if (randomNum == 4) {
				fours++;
			}
			if (randomNum == 5) {
				fives++;
			}
			if (randomNum == 6) {
				sixes++;
			}
		}
		System.out.println("Number of ones: " + ones + " Percentage: " + (ones / rolls) * 100 + "%");
		System.out.println("Number of twos: " + twos + " Percentage: " + (twos / rolls) * 100 + "%");
		System.out.println("Number of threes: " + threes + " Percentage: " + (threes / rolls) * 100 + "%");
		System.out.println("Number of fours: " + fours + " Percentage: " + (fours / rolls) * 100 + "%");
		System.out.println("Number of fives: " + fives + " Percentage: " + (fives / rolls) * 100 + "%");
		System.out.println("Number of sixes: " + sixes + " Percentage: " + (sixes / rolls) * 100 + "%");

	}
}