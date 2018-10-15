package objectorientedprogramming;

public class TriangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle abc = new Triangle();
		System.out.println("abc base:" + abc.getBase());
		System.out.println("abc height:" + abc.getHeight());
		abc.setBase(3);
		abc.setHeight(4);
		System.out.println("abc base:" + abc.getBase());
		System.out.println("abc height:" + abc.getHeight());

		abc = new Triangle(5, 12);
		System.out.println("abc base:" + abc.getBase());
		System.out.println("abc height:" + abc.getHeight());
		System.out.println("abc perimeter:" + abc.perimeter());
		System.out.println("abc area:" + abc.area());
	}

}
