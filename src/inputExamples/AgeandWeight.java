package inputExamples;
import java.util.Scanner;
public class AgeandWeight {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
int age = 17;
Scanner input = new Scanner(System.in);
System.out.println("How old are you");
age = input.nextInt();
System.out.println("I'm " + age + " years old");

double weight = 116.0;
System.out.println("What is your weight?");
weight = input.nextDouble();
System.out.println("My weight is " + weight + "pounds");
	}

}