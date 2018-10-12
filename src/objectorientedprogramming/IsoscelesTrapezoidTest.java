package objectorientedprogramming;

public class IsoscelesTrapezoidTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsoscelesTrapezoid abcd = new IsoscelesTrapezoid();
		System.out.println("abcd base1:" + abcd.getBase1());
		System.out.println("abcd base2:" + abcd.getBase2());
		System.out.println("abcd height:" + abcd.getHeight());
		System.out.println("abcd leg:" + abcd.getLeg());

		abcd = new IsoscelesTrapezoid(5, 9, 4, 6);
		System.out.println("abcd base1:" + abcd.getBase1());
		System.out.println("abcd base2:" + abcd.getBase2());
		System.out.println("abcd height:" + abcd.getHeight());
		System.out.println("abcd leg:" + abcd.getLeg());
		System.out.println("abcd perimeter:" + abcd.perimeter());
		System.out.println("abcd area:" + abcd.area());

	}

}
