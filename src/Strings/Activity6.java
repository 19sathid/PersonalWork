package Strings;
import java.util.Scanner;
public class Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Write a sentence: ");
String sentence = input.nextLine();
int length = sentence.length();
for(int i = 0; i < length; i++){
	char character = sentence.charAt(i);
// System.out.println("The number of characters are : " + length);
System.out.println("Index "+ i + ":" + character);
}
	}

}
