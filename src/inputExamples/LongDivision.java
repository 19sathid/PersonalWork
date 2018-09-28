package inputExamples;
import java.util.Scanner;
public class LongDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int dividend = 0;
int divisor = 0;
int quotient = 0;
int remainder = 0;
Scanner input = new Scanner(System.in);
System.out.println("Enter the dividend and the divisor");
dividend = input.nextInt();
divisor = input.nextInt();
quotient = dividend/divisor;
remainder = dividend%divisor;
System.out.println("The quotient is " + quotient + " and the remainder is " + remainder);
	}

}
