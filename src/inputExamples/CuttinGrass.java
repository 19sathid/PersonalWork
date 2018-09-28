package inputExamples;
import java.util.Scanner;
public class CuttinGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double length = -999.0;
double width = -999.0;
double area = -999.0;
double radius = -999.0;
double amount = -999.0;
Scanner input = new Scanner(System.in);
System.out.println("Enter the length and width of the lawn");
length = input.nextDouble();
width = input.nextDouble();
System.out.println("Enter the radius of the fountain");
radius = input.nextDouble();
area = (length*width)-(Math.PI*Math.pow(radius, 2));
amount = (area/100)*1.25;
System.out.println("The amount of money owed is $ " + amount);

	}

}
