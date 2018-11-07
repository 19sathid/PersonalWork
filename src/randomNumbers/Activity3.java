package randomNumbers;

import java.util.Random;

public class Activity3 {
		public static void main(String[]args){
	Random generator = new Random();
	int randomNum = 0;
	int min = 26;
	int max = 43;
	int tall = 0;
for(
	int counter = 1;counter<=248;counter++)
	{
		randomNum = min + generator.nextInt(max - min + 1);
		if (randomNum > 36)
			tall++;
	}System.out.println("Number of students greater than 3 feet = "+tall);
}}
