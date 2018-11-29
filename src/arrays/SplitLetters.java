package arrays;

import java.util.Random;
import java.util.Scanner;

public class SplitLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random(5);

		System.out.println("Enter a sentence");
		String sentence = input.nextLine();
		
		System.out.println("Enter a key word");
		String keyWord = input.nextLine();
		
		String[] words = sentence.split(" ");

		System.out.println("First letter of each word.");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i].charAt(0));
		}

		int num = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(keyWord)) {
				num++;
			}
		}
		System.out.println("Number of times the key word appears in the sentence is " + num);
		int min = 0;
		int max = words.length - 1;
		int randomWord = min + rand.nextInt(max - min + 1);
		System.out.println("Random Word : " + words[randomWord]);

		input.close();
	}

}
