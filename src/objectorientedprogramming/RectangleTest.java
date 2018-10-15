package objectorientedprogramming;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle box = new Rectangle();
		System.out.println("box length:" + box.getLength());
		System.out.println("box width:" + box.getWidth());
		System.out.println("box perimeter:" + box.perimeter());
		System.out.println("box area:" + box.area());
		box.setLength(7.2);
		box.setWidth(3);
		System.out.println("box length:" + box.getLength());
		System.out.println("box width:" + box.getWidth());

		box = new Rectangle(4.5, 6);
		System.out.println("box length:" + box.getLength());
		System.out.println("box width:" + box.getWidth());
		System.out.println("box area:" + box.area());
		box.setLength(7.2);
		box.setWidth(3);
		System.out.println("box length:" + box.getLength());
		System.out.println("box width:" + box.getWidth());
	}
}
