package classes;

import java.util.Random;

public class PileOJunk {
	private static int idNumber = 24;
	private int myId;
	private int integer;

	public PileOJunk() {
		myId = idNumber;
		idNumber += 2;
		Random rand = new Random();
		int min = 10;
		int max = 100;
		integer = min + rand.nextInt(max - min + 1);
	}

	public static int sum(int x, int y) {
		return (x + y);
	}

	public void setRandomNum(int integer) {
		this.integer = integer;
	}
}
