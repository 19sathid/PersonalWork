package Strings;

import java.util.Scanner;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Write a sentence");
		String sentence = input.nextLine();
		int length = sentence.length();
		for (int i = 0; i < length; i = i + 4) {
			System.out.println(sentence.charAt(i));
		}
	}

}
