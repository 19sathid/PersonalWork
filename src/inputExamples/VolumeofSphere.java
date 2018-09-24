package inputExamples;
import java.util.Scanner;
public class VolumeofSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double radius = 0.00;
double volume = 0.00;
Scanner input = new Scanner(System.in);
System.out.println("What is the radius of the sphere?");
radius = input.nextDouble();
volume = 4.0/3.0 *Math.PI*radius*radius*radius;
System.out.println("The volume of the sphere is " + volume + " cubic cm");
	}

}
