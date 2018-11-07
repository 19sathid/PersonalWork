package randomNumbers;

import java.util.Random;

public class FlipaCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int randomNum = 0;
		int min = 0;
		int max = 1;
		int heads = 0;
		int maxHeads = 0;
		int minHeads = 100;
		for (int i = 1; i <= 1000000; i++) {
			for (int counter = 1; counter <= 100000; counter++) {
				randomNum = min + generator.nextInt(max - min + 1);
				if (randomNum == 0) {
					heads++;
				}
				int percentage = (heads / 100000) * 100;
				if (percentage > maxHeads) {
					maxHeads = percentage;
				}
				if (percentage < minHeads) {
					minHeads = percentage;
				}
				heads = 0; // reset
			}
		}
		System.out.println("Max percentage of heads flipped = " + maxHeads);
		System.out.println("Minimum percentage of heads flipped = " + minHeads);
	}
}
