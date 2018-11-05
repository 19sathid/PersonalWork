package randomNumbers;

import java.util.Random;

public class Activity2 {
	Random generator = new Random();
	int randomNum = 0;
	int min = 1; // minimum random number generated
	int max = 13; // maximum random number generated
	int threes = 0;
for(int counter = 1;counter<=87;counter++)
	{
		randomNum = 1 + generator.nextInt(87 - 1 + 1);
		if(randomNum % 3 == 0)
			threes++;
	}
System.out.println("Number of times = " + threes);
}}