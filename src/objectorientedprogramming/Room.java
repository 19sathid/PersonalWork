package objectorientedprogramming;
import java.util.Scanner;
public class Room {

	public Room()
	{
	}
	public void area()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the wall");
		double length = input.nextDouble();
		System.out.println("Enter the height of the wall");
		double height = input.nextDouble();
		System.out.println("The area of the wall is " +(length*height));
	input.close();
	}
public void areaWithDoor()
{
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the length of the wall");
	double wLength = input.nextDouble();
	System.out.println("Enter the height of the wall");
	double wHeight = input.nextDouble();
	System.out.println("Enter the length of the door");
	double dLength = input.nextDouble();
	System.out.println("Enter the height of the door");
	double dHeight = input.nextDouble();
	
	System.out.println("The area of the wall is ");
	System.out.println((wLength*wHeight)+(dLength*dHeight));
	input.close();
}
}