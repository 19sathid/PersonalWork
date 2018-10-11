package objectorientedprogramming;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat kitty = new Cat();
		System.out.println("kitty age:" + kitty.getage());
		System.out.println("kitty hours:" + kitty.getHours());
		System.out.println("kitty ageCheck:" + kitty.ageCheck());
		kitty.setHours(5);
		kitty.setage(6.5);
		System.out.println("box hours:" + kitty.getHours());
		System.out.println("box age:" + kitty.getage());

		kitty = new Cat(6, 3.5);
		System.out.println("kitty age:" + kitty.getage());
		System.out.println("kitty hours:" + kitty.getHours());
		System.out.println("kitty ageCheck:" + kitty.ageCheck());
		kitty.setHours(5);
		kitty.setage(6.5);
		System.out.println("box hours:" + kitty.getHours());
		System.out.println("box age:" + kitty.getage());
	}

}
	}

}
