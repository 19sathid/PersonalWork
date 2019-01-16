package inheritance;

public class Player {
	private String health;
	private int locX;
	private int locY;

	public Player() {
		health = "alive";
		locX = 10;
		locY = 12;
	}

	public Player(String h, int x, int y) {
		health = h;
		locX = x;
		locY = y;
	}

	public String getHealth() {
		return health;
	}

	public int getLocX() {
		return locX;
	}

	public int getLocY() {
		return locY;
	}

	public void setHealth(String h) {
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
		if (health == "dead") {
			answer = true;
		} else if (health == "alive") {
			answer = false;
		}
		return answer;
	}

	public String stats() {
		return ("Player : Health : " + health + ", X coordinate : " + locX + ", Y coordinate : " + locY);
	}

}
