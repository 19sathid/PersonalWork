package objectorientedprogramming;

import java.util.Scanner;

public class HomeImprovement {

	public HomeImprovement()
{
}
	public void paintwall(){
		double length = -999.9;
		double height = -999.9;
		double time = -999.9;
		final double rate = 1/200.0; //200 sq ft per hour
		final double conversion= 60.0/1; //minutes per hour
		Scanner input = new Scanner(System.in);
		System.out.println("Length of the room:");
		length = input.nextDouble();
		System.out.println("Height of the room:");
		height = input.nextDouble();
		time = (length*height)*rate*conversion;
		System.out.println("It will take" + time + "minutes to paint the wall.");
	}
	public void paintWall(double length, double height){
		double time = -999.9;
		final double rate = 1/200.0; //200 sq ft per hour
		final double conversion = 60.0/1; //minutes per hour
		time = (length*height)*rate*conversion;
		System.out.println("It will take" + time + "minutes to paint the wall.");
	}
	public void plantGarden(){
		double length = -999.9;
		int rows = -999;
		double time =-999.9;
		final double rate = 2.0/15.0; //2 hours for 15 feet
		Scanner input = new Scanner(System.in);
		System.out.println("Length of the garden:");
		length = input.nextDouble();
		System.out.println("Rows in the garden:");
		rows = input.nextInt();
		time = (length*rows)*rate;
		System.out.println("It will take" + time + "hours to plant the garden.");
	}
	public void plantGarden(double length, int rows) {
		final double rate = 2.0/15.0; //2 hours for 15 feet
		double time = (length*rows)*rate;
		System.out.println("It will take" + time + "hours to plant the garden.");
	}
		
		
}
