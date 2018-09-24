package inputExamples;
import java.util.Scanner;
public class VolumeofBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double length = 0;
double breadth = 0;
double height = 0;
double volume = 0;
Scanner input = new Scanner(System.in);
System.out.println("What is the length, breadth, and height of the box?");
length = input.nextDouble();
breadth = input.nextDouble();
height = input.nextDouble();
volume = length*breadth*height;
System.out.println("The volume of the box is " + volume + "cm3");
	}

}
