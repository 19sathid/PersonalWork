package Strings;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence = input.nextLine();
		int sentenceLength = sentence.length();
		String reverse = "";
		for (int i = sentenceLength - 1; i >= 0; i--) {
			reverse = reverse + sentence.charAt(i);
		}
		System.out.println(reverse);

	}
}
