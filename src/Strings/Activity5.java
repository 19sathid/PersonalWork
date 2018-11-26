package Strings;
import java.util.Scanner;
public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Write a sentence:");
String sentence = input.nextLine();
int x = sentence.indexOf("X");
System.out.println("The letter X first occurs at index # " + x);

}
}
