package arrays;

import java.util.Random;

public class FriendTestClass {

	public static void main(String[] args) {
		Random rand = new Random();

		int rows = 18;
		int columns = 5;
		Friend[][] ages = new Friend[rows][columns];

		for (int r = 0; r < ages.length; r++) {
			for (int c = 0; c < ages[0].length; c++) {
				ages[r][c] = new Friend();
				int newAge = rand.nextInt(101);
				ages[r][c].setAge(newAge);
			}
		}
		for (int r = 0; r < ages.length; r++) {
			for (int c = 0; c < ages[0].length; c++) {
				System.out.print(ages[r][c].getAge() + "   ");
			}
			System.out.println("");
		}
	}

}
