package decisions;

public class NumberOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int c4 = 0;
		int c5 = 0;
		for (c1 = 1; c1 <= 4; c1++) {
			System.out.print(c1);
			for (c2 = c1 + 1; c1 <= 2; c2++) {
				System.out.print(c2+" ");
				for (c3 = c2 + 1; c3 <= 3; c3++) {
					System.out.print(c3+" ");
					for (c4 = c3 + 1; c4 <= 4; c4++) {
						System.out.print(c4+" ");
						for (c5 = c4 + 1; c5 <= 5; c5++) {
							System.out.print(c5+" ");
							System.out.print(c1+" ");
							System.out.println();
						}
					}
				}
			}
		}
	}

}
