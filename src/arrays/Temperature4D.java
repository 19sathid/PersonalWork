package arrays;

import java.util.Random;

public class Temperature4D {

	public static void main(String[] args) {
		Random rand = new Random();

		int rows = 10;
		int columns = 12;
		int thirdD = 4;
		int fourthD = 7;
		int min = -21;
		int max = 110;

		int[][][][] temperature = new int[rows][columns][thirdD][fourthD];

		// r = years
		// c = months
		// t = weeks
		// f = days

		int year = 2000;
		int largestAverage = 0;
		int highest = 0;
		int xYear = 0;
		int month = 0;
		
		for (int r = 0; r < temperature.length; r++) {
			year++;
			System.out.println(year);
			System.out.println("");
			for (int c = 0; c < temperature[0].length; c++) {
				int sum = 0;
				int average = 0;
				System.out.println("Month " + (c + 1));
				for (int t = 0; t < temperature[0][0].length; t++) {
					for (int f = 0; f < temperature[0][0][0].length; f++) {
						temperature[r][c][t][f] = min + rand.nextInt(max - min + 1);
						sum += temperature[r][c][t][f];
						System.out.print(temperature[r][c][t][f] + "   ");
					}
					System.out.println("");
				}
				System.out.println("");
				average = sum / 28;
				if (average > largestAverage) {
					largestAverage = average;
					month = c;
					xYear = year;
				}
			}
		}

		int dailyTemp = -30;
		int yYear = 0;
		int week = 0;
		int day = 0;
		year = 2000;
		
		for (int r = 0; r < temperature.length; r++) {
			year++;
			for (int c = 0; c < temperature[0].length; c++) {
				for (int t = 0; t < temperature[0][0].length; t++) {
					for (int f = 0; f < temperature[0][0][0].length; f++) {
						temperature[r][c][t][f] = min + rand.nextInt(max - min + 1);
						dailyTemp = temperature[r][c][t][f];
						if (dailyTemp > highest) {
							highest = dailyTemp;
							month = c + 1;
							yYear = year;
							week = t + 1;
							day = f + 1;
						}
					}
				}
			}
		}
		
		System.out.println("The highest daily temperature : " + highest + " degrees" + "    Year : " + yYear + "    Month : "
				+ month + "    Week : " + week + "    Day : " + day);
		System.out.println("The highest average monthly temperature : " + largestAverage + " degrees" + "    Month : "
				+ month + "    Year : " + xYear);
		
	}

}
