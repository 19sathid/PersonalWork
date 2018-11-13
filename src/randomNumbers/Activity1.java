package randomNumbers;

import java.util.Random;

public class Activity1 {
	public static void main(String[]args){
	Random generator = new Random();
	int randomNum = 0;
	int min = 0; // minimum random number generated
	int max = 1; // maximum random number generated
	int heads = 0;
	for(int counter = 1;counter<=100000;counter++)
	{
		randomNum = min + generator.nextInt(max - min + 1);
		if(randomNum == 0){
			heads++;
		}
	}
System.out.println("heads = " + heads);
System.out.println("tails = " + (100000 - heads));
}
}


