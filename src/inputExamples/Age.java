package inputExamples;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age = -999;
Scanner input = new Scanner(System.in);
System.out.println("Enter your age");
age = input.nextInt();
age = age + 7;
System.out.println("Age after 7 years will be " + age);
	}

}
