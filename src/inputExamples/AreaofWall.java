package inputExamples;
import java.util.Scanner;
public class AreaofWall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int height = 8;
int base = 999;
int area = 999;
Scanner input = new Scanner(System.in);
System.out.println("What is measurement of the base?");
base = input.nextInt();
area = height * base;
System.out.println("The area of the rectangle is " + area + "ft^2");
	}

}
