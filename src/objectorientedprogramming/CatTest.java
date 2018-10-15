package objectorientedprogramming;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat kitty = new Cat();
		System.out.println("Age: " + kitty.getAge());
		System.out.println("Hours of Sleep: " + kitty.getSleep());
		kitty.setAge(7);
		kitty.setsleepMore(7.5);
		System.out.println("Age: " + kitty.getAge() + " years");
		System.out.println("More hours of sleep: " + kitty.getSleep());
		kitty.setsleepLess(6.5);
		System.out.println("Less hours of sleep: " + kitty.getSleep());
		System.out.println("Age after birthday: " + kitty.getBirthday());
	}

}
