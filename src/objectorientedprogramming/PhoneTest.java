package objectorientedprogramming;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone bob = new Phone();
		System.out.println("Phone number:" + bob.getMyphonenumber());
		System.out.println("Last number called:" + bob.getLastnumbercalled());
		System.out.println("Talktime:" + bob.getTalktime() + " minutes");

		bob = new Phone(456789, 345678, 123456, 6, 15);
		System.out.println("Phone number:" + bob.getMyphonenumber());
		System.out.println("Last number called:" + bob.getLastnumbercalled());
		System.out.println("Talktime:" + bob.getTalktime() + " minutes");

	}

}
