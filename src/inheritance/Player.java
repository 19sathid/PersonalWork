package inheritance;

public class Player {
	private double health;
	private int locX;
	private int locY;

	public Player() {
		health = 0;
		locX = 10;
		locY = 12;
	}

	public Player(double h, int x, int y) {
		health = h;
		locX = x;
		locY = y;
	}

	public double getHealth() {
		return health;
	}

	public int getLocX() {
		return locX;
	}

	public int getLocY() {
		return locY;
	}

	public void setHealth(double h) {
		health = h;
	}

	public void setLocX(int x) {
		locX = x;
	}

	public void setLocY(int y) {
		locY = y;
	}

	public void move() {
		locX += 1;
		locY += 1;
	}

	public boolean dead() {
		boolean answer = false;
		if (health == 0) {
			answer = true;
		} else if (health == 1) {
			answer = false;
		}
		return answer;
	}

	public String stats() {
		return ("Player : Health : " + health + ", X coordinate : " + locX + ", Y coordinate : " + locY);
	}

}
