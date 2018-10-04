package objectorientedprogramming;

public class RoomActivityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
{
		Room closet = new Room();
		Room kitchen = new Room();
		kitchen = closet;
		Room basement = new Room();
		closet = basement;
		closet.area();
}
}
}
