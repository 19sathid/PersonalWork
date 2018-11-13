package Strings;

import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Write a sentence");
		String sentence = input.nextLine();

		System.out.println("Bob is in the sentence: " + sentence.contains("Bob"));
		System.out.println("The sentence is: " + sentence);
	}

}
