package objectorientedprogramming;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Circle ball = new Circle();
		System.out.println("ball radius:" + ball.getRadius());
		System.out.println("ball circumference:" + ball.circumference());
		System.out.println("ball area:" + ball.area());
		ball.setRadius(7.2);
		System.out.println("ball radius:" + ball.getRadius());
		
		ball = new Circle(12.25);
		System.out.println("ball radius:" + ball.getRadius());
		System.out.println("ball circumference:" + ball.circumference());
		System.out.println("ball area:" + ball.area());
		ball.setRadius(7.2);
		System.out.println("ball radius:" + ball.getRadius());
}
}