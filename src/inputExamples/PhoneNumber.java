package inputExamples;
import java.util.Scanner;
public class PhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int phonenumber = -999;
double areacode = -999.0;
double middledigits = -999.0;
double lastdigits = -999.0;
System.out.println("Enter your phonenumber without dashes");
phonenumber = input.nextInt();
areacode = (int)(phonenumber/10000000);
middledigits = (int)((phonenumber - (areacode*10000000))/10000);
lastdigits = ((phonenumber - (areacode*10000000))%10000);
System.out.println("Your phonenumber is " + phonenumber);
System.out.println("Area code = " + areacode);
System.out.println("Middle digits = " + middledigits);
System.out.println("Last digits = " + lastdigits);

input.close();}

}
