package decisions;

public class Numbers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int num2 = 0;
		for (num2 = 1; num2 <= 4; num2++) {
			for (num = 1; num <= 5; num++) {
				if (num != 3)
					System.out.print(num);
				else
					System.out.print(1);
			}
			System.out.println();
		}
	}

}
