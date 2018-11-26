package Strings;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		int randomNum1 = 0;
		int randomNum2 = 0;
		int randomNum3 = 0;
		int min = 0;
		int max = 9;
		System.out.println("Enter a word");
		String word1 = input.nextLine();
		System.out.println("Enter a word");
		String word2 = input.nextLine();
		int length = word2.length();
		System.out.println("Enter a word");
		String word3 = input.nextLine();
		char randomChar = word3.charAt(generator.nextInt(word3.length()));
		randomNum1 = min + generator.nextInt(max - min + 1);
		randomNum2 = min + generator.nextInt(max - min + 1);
		randomNum3 = min + generator.nextInt(max - min + 1);
		String character = "";
		character = character + word1.charAt(0) + word2.charAt(length - 1) + randomChar + randomNum1 + randomNum2
				+ randomNum3;
		System.out.println(character);

		input.close();
	}

}