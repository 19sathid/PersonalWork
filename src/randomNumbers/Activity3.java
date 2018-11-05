package randomNumbers;

import java.util.Random;

public class Activity3 {
	Random generator = new Random();
	int randomNum = 0;
	int min = 26;
	int max = 43;
int morethan36 = 0;
for(int counter = 1;counter<=248;counter++)
	{
		randomNum = 1 + generator.nextInt(248 - 1 + 1);
		if (randomNum > 36)
			morethan36++;
	}System.out.println("Number of students greater than 3 feet = "+ morethan36);
}}
