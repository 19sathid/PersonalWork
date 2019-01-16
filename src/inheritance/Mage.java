package inheritance;

import java.util.Random;

public class Mage extends Player {
	private int spells;
	Random rand = new Random();

	public Mage() {
		super();
		spells = 2;
	}

	public Mage(double n, int xCo, int yCo, int s) {
		super(n, xCo, yCo);
		spells = s;
	}

	public int getSpells() {
		return spells;
	}

	public void setSpells(int s) {
		spells = s;
	}

	public void move() {
		super.setLocX(1 + rand.nextInt(10));
		super.setLocY(1 + rand.nextInt(10));
		int chance = 1 + rand.nextInt(10);
		if (chance == 1) { 
			super.setHealth(super.getHealth() + 1);
		} 
		chance = 1 + rand.nextInt(8);
		if (chance == 1) {
			spells += 1;
		}
	}
}
