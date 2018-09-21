package inputExamples;
import java.util.Scanner;
public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int birthdate = 0;
Scanner input = new Scanner(System.in);
System.out.println("Enter your birthdate");
birthdate = input.nextInt();
int luckynumber = 0;
System.out.println("Enter your lucky number");
luckynumber = input.nextInt();
double weight = 116.0;
System.out.println("Enter your weight");
weight = input.nextDouble();
System.out.println("I can see your future, hmm...");
System.out.println("Your fortune says");
System.out.println(birthdate + " years from now you will have $" + weight + " in your bank account.");
	}

}
