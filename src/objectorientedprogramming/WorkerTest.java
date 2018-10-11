package objectorientedprogramming;

public class WorkerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker bob = new Worker();
		System.out.println("bob pay:" + bob.getPay());
		System.out.println("bob hours:" + bob.getHours());
		System.out.println("bob payCheck:" + bob.payCheck());
		bob.setHours(5);
		bob.setPay(6.5);
		System.out.println("bob hours:" + bob.getHours());
		System.out.println("bob pay:" + bob.getPay());

		bob = new Worker(6, 3.5);
		System.out.println("bob pay:" + bob.getPay());
		System.out.println("bob hours:" + bob.getHours());
		System.out.println("bob payCheck:" + bob.payCheck());

	}

}
