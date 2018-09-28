package inputExamples;
import java.util.Scanner;
public class ssn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);
int age = -999;
int ssn = -999;
int years = -999;
System.out.println("Enter your age and ssn number without dashes");
age = input.nextInt();
ssn = input.nextInt();
ssn = ssn%10000;
years = 18 - age;
System.out.println("Your age is " + age + " and " + years + " more years to turn 18");
System.out.println("The last four digits of your ssn number is " + ssn);

input.close();}

}
