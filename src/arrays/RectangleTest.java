package arrays;

import java.util.Scanner;
import java.util.Random;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random(5);
		int min = 10;
		int max = 56;
		Rectangle[] rec = new Rectangle[100];
		for (int i = 0; i < rec.length; i++) {
			int length = min + generator.nextInt(max - min + 1);
			int width = min + generator.nextInt(max - min + 1);
			rec[i] = new Rectangle(length, width);
			System.out.println("Rectangle number " + i);
			System.out.println("Length : " + rec[i].getLength());
			System.out.println("Breadth : " + rec[i].getWidth());
			System.out.println("Area : " + rec[i].area());
		}
		int smallestArea = rec[0].area();
		
		for (int i = 0; i < rec.length; i++) {
			if(rec[i].area() < smallestArea){
				smallestArea = rec[i].area();
			}
		}
		System.out.println("The smallest area is " + smallestArea);
	
		input.close();
	}

}
