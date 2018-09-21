package inputExamples;
import java.util.Scanner;
public class AgeuntilVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age = -999;
int years = -999;
Scanner input = new Scanner(System.in);
System.out.println("What is your age?");
age = input.nextInt();
years = 18 - age;
System.out.println("You can vote after " + years + " year(s)");
	}

}
