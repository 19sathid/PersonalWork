package inputExamples;
import java.util.Scanner;
public class Ages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int first = 999;
int second = 999;
int third = 999;
int sum = 999;
Scanner input = new Scanner(System.in);
System.out.println("What are the ages of three of your friends?");
first = input.nextInt();
second = input.nextInt();
third = input.nextInt();
sum = first + second + third;
System.out.println("The sum of the ages of three friends is  " + sum);
	}

}
