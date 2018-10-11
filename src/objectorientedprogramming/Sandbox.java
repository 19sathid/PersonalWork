package objectorientedprogramming;

import java.util.Scanner;

public class Sandbox {

	public Sandbox()
{
}
	public void paintwall(){
		double length = -999.9;
		double width = -999.9;
		double depth = -999.9;
		double time = -999.9;
		double rate = 1/200.0; //200 sq ft per hour
		Scanner input = new Scanner(System.in);
		System.out.println("Length of the sandbox:");
		length = input.nextDouble();
		System.out.println("Width of the sandbox:");
		width = input.nextDouble();
		System.out.println("Depth of the sandbox:");
		depth = input.nextDouble();
		System.out.println("Rate at which sand is transported each hour:");
		rate = input.nextDouble();
		time = (length*width*depth)*rate;
		System.out.println("It will take" + time + "hours to fill the sandbox.");
}
}
	