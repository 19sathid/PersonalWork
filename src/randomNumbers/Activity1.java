package randomNumbers;

import java.util.Random;

public class Activity1 {
	Random generator = new Random();
	int randomNum = 0;
	int min = 1; // minimum random number generated
	int max = 100000; // maximum random number generated
	int heads = 0;
	for(int counter = 1;counter<=100000;counter++)
	{
		randomNum = 1 + generator.nextInt(100000 - 1 + 1);
		if(randomNum == 0)
			heads++;
	}
System.out.println("heads = " + heads);
System.out.println("tails = " + (100000 - heads));
}
}


