package Strings;
import java.util.Scanner;
public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Write a sentence");
		String sentence = input.nextLine();
		int length = sentence.length();
		for (int i = 0; i < length; i++) {
			char character = sentence.charAt(i);
			if(character != ' ' && character != 'a'){
				System.out.print(character);
			}
		}
		System.out.println("");
		System.out.println(sentence);
}
}
