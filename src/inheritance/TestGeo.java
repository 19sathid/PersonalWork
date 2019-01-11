package inheritance;

import java.util.ArrayList;
import java.util.Random;

public class TestGeo {

	public static void main(String[] args) {
		Random rand = new Random();

		for (int i = 0; i < 10; i++) {
			ArrayList<Geo> shapes = new ArrayList<Geo>();
			int chance = 1 + rand.nextInt(2);
			if (chance == 1) {
				shapes.add(new Rectangle());
			} else {
				shapes.add(new Trapezoid());
			}

			int largestAreaIndex = 0;
			double largestArea = shapes.area();

		}

	}
}
