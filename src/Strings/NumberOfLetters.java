package Strings;

import java.util.Scanner;

public class NumberOfLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int consonants = 0;
		int vowels = 0;
		int punctuation = 0;
		System.out.println("Write a sentence:");
		String sentence = input.nextLine();
		int length = sentence.length();
		for (int i = 0; i < length; i++) {
			char ch = sentence.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					vowels++;
				else
					consonants++;
			}
			if (ch == '.' || ch == ',' || ch == '?' || ch == '!' || ch == '"' || ch == ';' || ch == ':') {
				punctuation++;
			}
		}
		System.out.println("Number of vowels: " + vowels);
		System.out.println("Number of consonants: " + consonants);
		System.out.println("Number of punctuation marks: " + punctuation);

		input.close();
	}
}
