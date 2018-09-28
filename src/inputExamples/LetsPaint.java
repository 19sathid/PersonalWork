package inputExamples;
import java.util.Scanner;
public class LetsPaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
final int height = 8;
double gallons = -999;
double length = -999;
double width = -999;
double area = -999.0;
Scanner input = new Scanner(System.in);
System.out.println("What is the length and width of the room?");
length = input.nextDouble();
width = input.nextDouble();
area = 2*(length + width)*height;
gallons = area/150;
System.out.println("The area of wall space to be painted is " + area + " and the number of gallons of paint needed to paint the room is " + gallons);
	}

}
