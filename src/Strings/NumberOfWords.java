package Strings;

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int words = 0;
		int spaces = 0;
		String word = "";
		System.out.println("Write a sentence: ");
		String sentence = input.nextLine();
		int length = sentence.length();
		for (int i = 0; i <= length - 1; i++) {
			char character = sentence.charAt(i);
			word = word + sentence.charAt(i);
			if (character == ' ') {
				spaces++;
				System.out.println(word);
				word = "";
			}
			// word = "";
		}
		System.out.println(word);
		words = spaces + 1;
		System.out.println("Number of words: " + words);
		
		input.close();
	}

}